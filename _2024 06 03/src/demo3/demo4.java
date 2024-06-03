package demo3;

import javafx.util.Pair;
import sun.misc.Lock;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-03
 * Time: 19:52
 */
public class demo4 {
    public static void main(String[] args) {
        Object locker1 = new Object();
        Object locker2 = new Object();
        Thread t1 = new Thread(() -> {
            synchronized(locker2){
                try {
                    locker2.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println('a');
            }
        },"a");
        Thread t2 = new Thread(() -> {
            synchronized(locker1){
                try {
                    locker1.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println('b');
                synchronized(locker2){
                    locker2.notify();
                }
            }

        },"b");
        Thread t3 = new Thread(() -> {
            synchronized(locker1){
                System.out.println('c');
                locker1.notify();
            }
        },"c");
        Lock lock = new Lock();
        t1.start();
        t2.start();
        t3.start();
    }
}
