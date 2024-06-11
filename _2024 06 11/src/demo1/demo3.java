package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-11
 * Time: 9:19
 */
//自己实现一个线程池
import java.util.concurrent.*;
import java.util.*;

class MyThreadPool {
    //1. 线程
    private int corePoolSize;//核心线程数
    private int maximumPoolSize;//最大线程数
    private BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(1000);
    private List<Thread> ret = new ArrayList<>();
    public MyThreadPool(int coreThreadSize, int maximumPoolSize) throws InterruptedException {
        this.corePoolSize = coreThreadSize;
        this.maximumPoolSize = maximumPoolSize;
        for (int i = 0; i < coreThreadSize; i++) {
            Thread t = newThread();
            t.start();
            ret.add(t);
        }
    }

    private Thread newThread() {//执行任务即可，没有其他的事情了
        Thread t = new Thread(() -> {
            while (true) {
                try {
                    Runnable task = queue.take();
                    task.run();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        return t;
    }

    //2. 阻塞队列
    //3. submit 方法
    public void submit(Runnable task, int reject) throws InterruptedException {
        if (queue.size() > 100 && ret.size() < maximumPoolSize) {
            //非核心线程增加
            Thread t = newThread();
            t.start();
            ret.add(t);
        }
        if (queue.size() >= 1000) {//拒接策略
            switch (reject) {
                case 1: {
                    throw new RuntimeException();
                }
                case 2: {
                    task.run();//谁 submit ，谁执行b
                    break;
                }
                case 3: {
                    queue.take();//丢弃最早的
                    break;
                }
                case 4: {
                    //丢弃现在的
                    break;
                }
            }
        }else{
            queue.put(task);
        }
    }
}


public class demo3 {
    public static void main(String[] args) throws InterruptedException {
        MyThreadPool threadPool = new MyThreadPool(2, 1000);
        for (int i = 0; i < 1000000; i++) {
            int id = i;
            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("hello " + id + " ," + Thread.currentThread().getName());
                }
            }, 4);
        }
    }
}
