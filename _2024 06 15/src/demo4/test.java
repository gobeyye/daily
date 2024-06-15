package demo4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-15
 * Time: 19:44
 */


import java.util.*;

public class test {
    public static void main(String[] args) {
        //线程没有被引用会被自动回收嘛
        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            Thread t = new Thread(() -> {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            });
            t.start();
            list.add(t);
        }
        for (int i = 0; i < 3; i++) {
            list.get(i).interrupt();
        }
        System.out.println("释放完毕");


    }
}
