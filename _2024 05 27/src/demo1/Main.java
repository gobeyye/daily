package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-27
 * Time: 13:01
 */

public class Main {
    private static int count = 0;
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread t1 = new Thread(() -> {
            //对 count 变量进行自增 5w次
            for (int i = 0; i < 50000; i++) {
                synchronized(lock){
                    count++;
                }
            }
        });
        Thread t2 = new Thread(() -> {
            //对 count 变量进行自增 5w次
            for (int i = 0; i < 50000; i++) {
                synchronized(lock){
                    count++;
                }
            }
        });
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        // 预期值为 10w
        System.out.println(count);
    }
}
