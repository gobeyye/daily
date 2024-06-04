package boke;



/**
 * Created with IntelliJ IDEA.
 * Description:?
 * User: HXL
 * Date: 2024-06-04
 * Time: 11:20
 */
import java.util.*;
public class demo3 {
    public static void main(String[] args) {
        Object locker = new Object();
        Thread t1 = new Thread(() -> {
            System.out.println("t1:开始等待");
            synchronized(locker){
                try {
                    locker.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("t1:结束等待");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("t2:开始等待");
            synchronized(locker){
                try {
                    locker.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("t2:结束等待");
        });
        Thread t3 = new Thread(() -> {
            Scanner in = new Scanner(System.in);
            System.out.print("输入内容开始通知:");
            in.next();
            synchronized(locker){
                locker.notify();//修改处
                System.out.println("通知结束");
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
