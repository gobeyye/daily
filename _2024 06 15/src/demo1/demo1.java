package demo1;

import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-15
 * Time: 16:15
 */
class MyTimerTask implements Comparable<MyTimerTask> {
    private long time;//绝对时间
    private Runnable runnable;//加上 private 体现封装性

    public MyTimerTask(Runnable runnable, long time) {
        this.runnable = runnable;
        this.time = time + System.currentTimeMillis();//绝对时间
    }

    public void run() {//方便后续调用
        runnable.run();
    }
    public long getTime(){
        return time;
    }

    //重写比较器,从小到大排序
    @Override
    public int compareTo(MyTimerTask o) {
        return this.time >= o.time ? 1 : -1;
    }
}

class MyTimer {
    private Object locker = new Object();
    //不用阻塞优先级队列，因为有两个锁，一不小心就死锁了
    private PriorityQueue<MyTimerTask> heap = new PriorityQueue<MyTimerTask>();//因为有实现 comparable 所以 不用再传入比较器
    public void schedule(Runnable runnable,long delay){
        synchronized(locker){
            MyTimerTask task = new MyTimerTask(runnable,delay);
            heap.add(task);
            locker.notify();//这里必须要唤醒一下，因为添加新的任务后，绝对时间最小的不一定就是栈顶元素，要把新加入的元素一起考虑一下。
        }
    }
    public MyTimer(){
        Thread thread = new Thread(() -> {
            try{
                while (true) {
                    synchronized (locker) {
                        if (heap.isEmpty()) {
                            locker.wait();
                        }
                        MyTimerTask tmp = heap.peek();
                        long curTime = System.currentTimeMillis();
                        if (curTime >= tmp.getTime()) {
                            //执行
                            tmp.run();
                            heap.poll();
                        } else {
                            //时间还未到
                            locker.wait(tmp.getTime() - curTime);
                        }
                    }
                }
            }catch(InterruptedException e){//把异常统一处理
                throw new RuntimeException(e);
            }
        });
        thread.start();//线程启动
    }
}

public class demo1 {

    public static void main(String[] args) {
        MyTimer timer = new MyTimer();
        timer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello 3000");
            }
        },3000);
        timer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello 2000");
            }
        },2000);
        timer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello 1000");
            }
        },1000);
    }
}
