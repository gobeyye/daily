package demo3;

import javafx.util.Pair;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-03
 * Time: 19:14
 */
class MyRunnalble implements Runnable{
    Object lock;
    int a;
    public MyRunnalble(Object lock,int a){
        this.lock = lock;
        this.a = a;
    }
    @Override
    public void run() {
        System.out.println(a + ":start");
        synchronized(lock){
            try {
                lock.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(a + ":end");
    }
}
public class demo3 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        Thread t1 = new Thread(() -> {
            System.out.println("t1 start");
            synchronized(object){
                try {
//                    System.out.println("aaaa");
                    object.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("t1 end");
        });
        Thread t2 = new Thread(new MyRunnalble(object,2));
        Thread t3 = new Thread(new MyRunnalble(object,3));
        Thread t4 = new Thread(() -> {
            System.out.println("开始开锁");
            synchronized(object){
                object.notify();
            }
            System.out.println("结束开锁");
        });
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(1000);
        t4.start();
    }
}
