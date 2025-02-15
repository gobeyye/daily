import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    // 计数器private static volatile int COUNTER = 0;
    private static volatile int COUNTER = 0;
    private static Object lock = new Object();
    // 定义一个单独的锁对象private static Object lock = new Object();

    public static void main(String[] args) {
        // 创建三个线程，并指定线程名，每个线程名分别用A,B,C表示
        Thread t1 = new Thread(() -> {
            // 循环10次
            for (int i = 0; i < 10; i++) {
                // 执行的代码加锁
                synchronized (lock) {
                    while(COUNTER % 3 != 0){
                        try {
                            // 不满足输出条件时，主动等待并释放锁
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print(Thread.currentThread().getName());
                    // 每次唤醒后都重新判断是否满足条件// 每条线程判断的条件不一样，注意线程t1,t2while (COUNTER % 3 != 0) {
                    COUNTER++;
                    // 唤醒其他线程
                    lock.notifyAll();
                }
                // 满足输出条件，打印线程名，每条线程打印的内容不同System.out.print(Thread.currentThread().getName());
                // 累加计数

            }
        }
                , "A");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    while (COUNTER % 3 != 1) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print(Thread.currentThread().getName());
                    COUNTER++;
                    lock.notifyAll();
                }
            }
        }, "B");

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronized (lock) {
                    while (COUNTER % 3 != 2) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // 换行打印System.out.println(Thread.currentThread().getName());
                    System.out.println(Thread.currentThread().getName());
                    COUNTER++;
                    lock.notifyAll();
                }
            }
        }, "C");

        // 启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}