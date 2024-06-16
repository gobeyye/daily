package demo2;

import java.util.concurrent.CountDownLatch;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-16
 * Time: 23:11
 */
public class demo5 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(4);
        Thread t1 = new Thread(() -> {
            System.out.println("hello T1");
            countDownLatch.countDown();
        });
        Thread t2 = new Thread(() -> {
            System.out.println("hello T1");
            countDownLatch.countDown();
        });
        Thread t3 = new Thread(() -> {
            System.out.println("hello T1");
            countDownLatch.countDown();
        });
        Thread t4 = new Thread(() -> {
            System.out.println("hello T1");
            countDownLatch.countDown();
        });
        t1.start();
        t2.start();
        t3.start();
//        t4.start();
        countDownLatch.await();
        System.out.println("执行结束");
    }
}
