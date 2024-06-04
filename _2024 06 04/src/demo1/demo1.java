package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-04
 * Time: 20:38
 */
public class demo1 {
    public static void main(String[] args) {
        Object locker1 = new Object();
        Object locker2 = new Object();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized(locker1){
                    System.out.print("A");
                    locker1.notify();
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (locker1) {
                    try {
                        locker1.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized(locker2){
                        System.out.print("B");
                        locker2.notify();
                    }
                }

            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized(locker2){
                    try {
                        locker2.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("C");
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
