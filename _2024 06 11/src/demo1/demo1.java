package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-11
 * Time: 8:16
 */

import java.util.concurrent.*;
import java.util.*;

public class demo1{
    public static void main(String[] args) {
        int corePoolSize = 2;
        int maximumPoolSize = 4;
        int time = 4;
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                return t;
            }
        };
        TimeUnit unit = TimeUnit.SECONDS;
        BlockingQueue<Runnable> q = new LinkedBlockingQueue<>();
        RejectedExecutionHandler rejectedExecutionHandler = new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

            }
        };
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(corePoolSize,maximumPoolSize,time,unit,q,
                threadFactory,rejectedExecutionHandler);
//
    }
}