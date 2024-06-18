package demo1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-18
 * Time: 20:16
 */
public class demo3 {
    static AtomicInteger count = new AtomicInteger();
    public static void main(String[] args) {
        int tmp = count.getAndIncrement();
        System.out.println(tmp);
    }
}
