package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-11
 * Time: 12:01
 */


import java.util.*;

//先实现单线程
public class MyTimer {
    private PriorityQueue<MyTimerTask> heap = new PriorityQueue<>((o1,o2) -> {
        return o1.getTime() > o2.getTime() ? 1 : -1;
    });
    private Object locker = new Object();
    public MyTimer() throws InterruptedException {
        Thread t = new Thread(() -> {
            while (true) {
                synchronized (locker) {
                    while (heap.size() == 0) {
                        try {
                            locker.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    MyTimerTask tmp = heap.peek();
                    long curTime = System.currentTimeMillis();
                    if (curTime >= tmp.getTime()) {
                        tmp.run();
                        heap.poll();//执行完，要弹出
                    } else {
                        try {
                            locker.wait(tmp.getTime() - curTime);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }

        });
        t.start();
    }
    //分开来，这个的功能只要添加即可
    public void schedule(Runnable task, long delay){
        synchronized (locker) {
            heap.add(new MyTimerTask(task, delay));
            locker.notify();
        }
    }
}
