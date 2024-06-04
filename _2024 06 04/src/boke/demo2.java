package boke;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-04
 * Time: 11:12
 */
public class demo2 {
    public static void main(String[] args) {
        Object locker = new Object();
        Thread t1 = new Thread(() -> {
            System.out.println("开始等待");
            synchronized(locker){
                try {
                    locker.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("结束等待");
        });
        Thread t2 = new Thread(() -> {
            Scanner in = new Scanner(System.in);
            System.out.print("输入内容开始通知:");
            in.next();
            synchronized(locker){
                locker.notify();
                System.out.println("通知结束");
            }
        });
        t1.start();
        t2.start();
    }
}
