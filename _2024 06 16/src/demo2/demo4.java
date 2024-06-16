package demo2;

import java.util.concurrent.Semaphore;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-16
 * Time: 22:57
 */
public class demo4 {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(4);
        semaphore.acquire(2);
        semaphore.release(2);
        for(int i = 0;i < 5;i++){
            semaphore.acquire(3);
        }
        System.out.println("线程结束");

    }
}
