package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-21
 * Time: 21:40
 */
import java.util.concurrent.*;
public class demo4 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "获取到资源");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                };
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "释放资源");
                semaphore.release();
            }
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.start();t2.start();
    }
}
