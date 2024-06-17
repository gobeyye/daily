package demo1;
//要放在上面
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-17
 * Time: 20:07
 */
public class demo2 {
    public static void main(String[] args) {
        ReentrantLock reenTranLock = new ReentrantLock(true);
        reenTranLock.tryLock();
        reenTranLock.lock();
        reenTranLock.unlock();
        //类似于停车场，就是用来计数的
    }
}
