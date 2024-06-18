package demo1;

import java.util.concurrent.Semaphore;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-18
 * Time: 21:29
 */
public class demo5 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(4);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("申请资源");
                    semaphore.acquire();
                    System.out.println("我获取到资源了");
                    Thread.sleep(1000);
                    System.out.println("我释放资源了");
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        for (int i = 0; i < 20; i++) {
            Thread t = new Thread(runnable);
            t.start();
        }

    }

}
