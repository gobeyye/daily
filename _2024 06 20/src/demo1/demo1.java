package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-20
 * Time: 10:29
 */
import java.util.concurrent.atomic.*;
public class demo1 {
    static AtomicInteger count = new AtomicInteger();
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i < 50000;i++){
                    count.getAndIncrement();
                }
            }
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }
}
