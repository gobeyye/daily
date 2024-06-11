package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-11
 * Time: 12:01
 */
public class MyTimerTask {
    private long time;
    private Runnable task;
    public MyTimerTask(Runnable task,long time){
        this.task = task;
        this.time = time + System.currentTimeMillis();
    }
    public void run(){
        task.run();
    }
    public long getTime(){
        return time;
    }
}
