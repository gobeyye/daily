package demo2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-16
 * Time: 22:43
 */
public class demo3 {
    static ReentrantLock locker = new ReentrantLock(true);
    public static void main(String[] args) {
        locker.lock();
        locker.unlock();
        locker.tryLock();
        locker.newCondition();
    }
}
