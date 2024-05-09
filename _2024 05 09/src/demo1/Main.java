package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-09
 * Time: 14:45
 */
//1.第一种写法：继承Thread重写run
    class MyThread extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("hello Tread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        while(true){
            System.out.println("hello Main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
