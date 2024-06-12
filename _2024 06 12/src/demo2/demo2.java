package demo2;

import java.util.Date;
import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-12
 * Time: 20:39
 */
enum E{
    DAY,SECONDES;
}
public class demo2 {
    public static void main(String[] args) {
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(5);
        ThreadFactory factory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                return new Thread();
            }
        };
        RejectedExecutionHandler handler = new ThreadPoolExecutor.AbortPolicy();
        ThreadPoolExecutor p = new ThreadPoolExecutor(3,4,19, TimeUnit.DAYS,
                queue,factory,handler);
        p.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
    }
}
