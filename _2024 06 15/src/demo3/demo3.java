package demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-15
 * Time: 19:26
 */

import java.nio.channels.ShutdownChannelGroupException;
import java.util.concurrent.*;
import java.util.*;

//自己实现一个线程池
class MyThreadPool {
    //1. 线程
    private int corePoolSize;//核心线程数
    private int maximumPoolSize;//最大线程数
    private long Alivekeeptime;
    Timer timer = new Timer();
    private BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(1000);

    List<Thread> threads = new ArrayList<>();//存储线程

    public MyThreadPool(int coreThreadSize, int maximumPoolSize,long Alivekeeptime) throws InterruptedException {
        this.corePoolSize = coreThreadSize;
        this.maximumPoolSize = maximumPoolSize;
        this.Alivekeeptime = Alivekeeptime;
        for (int i = 0; i < coreThreadSize; i++) {
            Thread t = newThread();
            t.start();
            threads.add(t);
        }
    }

    private Thread newThread() {
        //每个线程的任务就是不停的执行队列中的元素
        Thread t = new Thread(() -> {
            while (true) {
                try {
                    Runnable task = queue.take();
                    task.run();
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        return t;
    }
    private Thread newThread222() {
        //每个线程的任务就是不停的执行队列中的元素
        Thread t = new Thread(() -> {
            while (Thread.currentThread().isInterrupted()) {
                try {
//                    timer.schedule();
                    long cur = System.currentTimeMillis();
                    Runnable task = queue.take();
                    if(System.currentTimeMillis() - cur >= Alivekeeptime){
                        queue.add(task);
                        Thread.currentThread().interrupt();
                    }else{
                        task.run();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        return t;
    }

    //2. 阻塞队列
    //3. submit 方法
    public void submit(Runnable task) throws InterruptedException {
        queue.put(task);
        //如果队列中的元素大于一个阈值，且线程数小于最大线程数时，就可以创建新的线程来帮助，处理队列中的元素
        if (queue.size() >= 1 && threads.size() < maximumPoolSize) {
            //创建 线程
            Thread t = newThread222();
            t.start();
            threads.add(t);
        }
    }
}

public class demo3 {
    public static void main(String[] args) throws InterruptedException {
        MyThreadPool threadPool = new MyThreadPool(1, 10,50000000000000000L);
        for (int i = 0; i < 1000; i++) {
            int id = i;
            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("hello " + id + " ," + Thread.currentThread().getName());
                }
            });
            System.out.println(i);
        }
        Thread.sleep(5000);
        for(int i = 0;i < threadPool.threads.size();i++){
            System.out.println(threadPool.threads.get(i).isAlive());
        }
    }
}


