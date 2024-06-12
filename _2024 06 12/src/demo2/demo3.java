package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-12
 * Time: 22:22
 */
import java.util.concurrent.*;
public class demo3 {
    public static void main(String[] args) {
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(5);//阻塞队列
        ThreadFactory factory = new ThreadFactory() {//工厂模式
            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r);//这里就可以对 Thread 设置一些参数
            }
        };
        RejectedExecutionHandler handler = new ThreadPoolExecutor.AbortPolicy();//拒绝策略，注意这里是调用 ThreadPoolExecutor 的静态内部类
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3,6,100,TimeUnit.DAYS,
                queue,factory,handler);
    }
}
