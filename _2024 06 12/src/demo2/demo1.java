package demo2;

import jdk.nashorn.internal.ir.Block;



/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-12
 * Time: 8:33
 */


import java.util.concurrent.*;
public class demo1 {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(100);//设置阻塞队列的容量为 100
        Thread producer = new Thread(() -> {//生产者
            for (int i = 1; i < 100000; i++) {
                try {
                    System.out.println("生产：" + i);
                    queue.put(i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"生产者");
        producer.start();
        Thread customer = new Thread(() -> {//消费者
            for (int i = 1; i < 100000; i++) {
                try {
                    Thread.sleep(1000);
                    int tmp = queue.take();
                    System.out.println("消费：" + tmp);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"消费者");
        customer.start();
    }
}
