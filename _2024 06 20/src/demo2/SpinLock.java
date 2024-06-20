package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-20
 * Time: 20:20
 */
public class SpinLock {
    private Thread owner = null;
    public void lock(){
        // 通过 CAS 看当前锁是否被某个线程持有.
        // 如果这个锁已经被别的线程持有, 那么就⾃旋等待.
        // 如果这个锁没有被别的线程持有, 那么就把 owner 设为当前尝试加锁的线程.
        while(!CAS(this.owner, null, Thread.currentThread())){
        }
    }
    public void unlock (){
        this.owner = null;
    }
}
