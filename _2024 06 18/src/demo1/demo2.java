package demo1;

//import java.util.concurrent.locks.ReentrantReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-18
 * Time: 19:37
 */
class A{
    static class B{
        public B(){

        }
    }
}
public class demo2 {
    public static void main(String[] args) {
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);
//        ReentrantReadWriteLock.WriteLock read = new ReentrantReadWriteLock.WriteLock(lock);


    }
}
