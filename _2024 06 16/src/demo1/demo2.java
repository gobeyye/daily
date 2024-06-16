package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-16
 * Time: 10:04
 */
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.*;

public class demo2 {
    static public AtomicInteger count = new AtomicInteger();//volatile 只要是在类型前面就都行
    // static 和 public 也可以交换顺序
    public static void main(String[] args) throws InterruptedException {
        //基于 AtomicInteger 实现多个线程自增同一个变量
        Thread t1 = new Thread(() -> {
            for(int i = 0;i < 50000;i++){
                count.getAndIncrement();
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0;i < 50000;i++){
                count.getAndIncrement();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }
}
