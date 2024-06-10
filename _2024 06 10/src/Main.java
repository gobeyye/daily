/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<Integer>();
        Thread customer = new Thread(() -> {
            while (true) {
                try {
                    int value = blockingQueue.take();
                    System.out.println("消费元素: " + value);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "消费者");
        customer.start();
        Thread producer = new Thread(() -> {
            Random random = new Random();
            while (true) {
                try {
                    int num = random.nextInt(1000);
                    System.out.println("⽣产元素: " + num);
                    blockingQueue.put(num);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "⽣产者");
        producer.start();
//        customer.join();
//        producer.join();
    }
}

