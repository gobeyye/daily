package demo1;



/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-13
 * Time: 12:39
 */

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class demo1 {
    public static void main(String[] args) {
        //能够根据任务数量，自动进行线程扩容的线程池
        ExecutorService sevice1 = Executors.newCachedThreadPool();
        //创建固定线程数目的线程池
        ExecutorService service2 = Executors.newFixedThreadPool(4);
        //创建只包含单个线程的线程池
        ExecutorService service3 = Executors.newSingleThreadExecutor();
        //创建固定数目的线程个数，但是任务延时执行的线程池
        ExecutorService service4 = Executors.newScheduledThreadPool(4);
//        service4.submit()
    }
}
