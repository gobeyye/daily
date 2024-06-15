package test115;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-15
 * Time: 22:43
 */
public class demo1 {
    private static AtomicInteger count = new AtomicInteger();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for(int i = 0;i < 50000;i++){
                count.getAndIncrement();
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0;i < 50000;i++){
                count.getAndIncrement();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }
}
