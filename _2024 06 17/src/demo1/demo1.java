package demo1;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-17
 * Time: 19:33
 */
public class demo1 {
    static AtomicInteger count = new AtomicInteger();
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDawnLatch = new CountDownLatch(2);
        Thread t1 = new Thread(() -> {
            for(int i = 0;i < 50000;i++){
                count.getAndIncrement();
            }
            countDawnLatch.countDown();
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0;i < 50000;i++){
                count.getAndIncrement();
            }
            countDawnLatch.countDown();
        });
        t1.start();
        t2.start();
        countDawnLatch.await();
        System.out.println(count);
    }
}
