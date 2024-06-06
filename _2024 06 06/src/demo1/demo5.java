package demo1;


import javafx.beans.property.adapter.ReadOnlyJavaBeanBooleanProperty;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-06
 * Time: 20:43
 */
public class demo5 {
    static Object locker1 = new Object();
    static Object locker2 = new Object();
    static Object locker3 = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for(int i = 0;i < 10;i++){
                synchronized(locker1){
                    try {
                        locker1.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.print(Thread.currentThread().getName());
                synchronized(locker2){
                    locker2.notify();
                }
            }

        },"A");
        Thread t2 = new Thread(() -> {
            for(int i = 0;i < 10;i++){
                synchronized(locker2){
                    try {
                        locker2.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.print(Thread.currentThread().getName());
                synchronized(locker3){
                    locker3.notify();
                }
            }

        },"B");
        Thread t3 = new Thread(() -> {
            for(int i = 0;i < 10;i++){
                synchronized(locker3){
                    try {
                        locker3.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(Thread.currentThread().getName());
                synchronized(locker1){
                    locker1.notify();
                }
            }

        },"C");
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(1000);
        synchronized(locker1){
            locker1.notify();
        }
    }
}
