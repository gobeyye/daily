package demo1;

import java.util.concurrent.Semaphore;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-18
 * Time: 21:32
 */
public class demo6 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("获取资源");
                try {
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("获取到资源");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("释放资源");
            }
        };
    }
}
