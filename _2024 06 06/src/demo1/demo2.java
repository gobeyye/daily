package demo1;

import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-06
 * Time: 19:31
 */
public class demo2 {
    public static void main(String[] args) {
        BlockingQueue<Integer> q = new ArrayBlockingQueue<>(1000);
        Thread t1 = new Thread(() -> {
            for(int i = 0;;i++){
                try {
//                    Thread.sleep(1000);
                    System.out.println("t1生产: " + i);
                    q.put(i);
                } catch (InterruptedException e) {
//                    System.out.println("aaaaaaaaaaaaaaaaaaaa");
//                    break;
                }
            }
        });
        Thread t2 = new Thread(() -> {
            while(true){
                try {
                    Thread.sleep(1000);
                    int tmp = q.take();
                    System.out.println("t2:消费 " + tmp);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
