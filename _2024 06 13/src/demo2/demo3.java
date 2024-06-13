package demo2;





import java.util.concurrent.*;
import java.util.*;
//自己实现一个线程池
class MyThreadPool{
    //1. 线程
    private int corePoolSize;//核心线程数
    private int maximumPoolSize;//最大线程数
    private BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(1000);

    private List<Thread> threads = new ArrayList<>();//存储线程
    public MyThreadPool(int coreThreadSize,int maximumPoolSize) throws InterruptedException {
        this.corePoolSize = coreThreadSize;
        this.maximumPoolSize = maximumPoolSize;
        for(int i = 0;i < coreThreadSize;i++){
            Thread t = newThread();
            t.start();
            threads.add(t);
        }
    }
    private Thread newThread(){
        //每个线程的任务就是不停的执行队列中的元素
        Thread t = new Thread(() -> {
            while(true){
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
    public void submit(Runnable task) throws InterruptedException {
        queue.put(task);
        //如果队列中的元素大于一个阈值，且线程数小于最大线程数时，就可以创建新的线程来帮助，处理队列中的元素
        if(queue.size() >= 50 && threads.size() < maximumPoolSize){
            //创建 线程
            Thread t = newThread();
            t.start();
            threads.add(t);
        }
    }
}
public class demo3 {
    public static void main(String[] args) throws InterruptedException {
        MyThreadPool threadPool = new MyThreadPool(4,50);
        for(int i = 0;i < 10000;i++) {
            int id = i;
            threadPool.submit(new Runnable(){
                @Override
                public void run(){
                    System.out.println("hello " + id + " ," + Thread.currentThread().getName());
                }
            });
        }
    }
}

