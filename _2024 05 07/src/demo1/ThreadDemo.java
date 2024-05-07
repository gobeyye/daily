package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-07
 * Time: 16:22
 */
import java.util.Random;
public class ThreadDemo {
    private static class MyThread extends Thread {
        @Override
        public void run() {
            Random random = new Random();
            while (true) {
                // 打印线程名称
                System.out.println(Thread.currentThread().getName());
                try {
                    // 随机停⽌运⾏ 0-9 秒
                    Thread.sleep(random.nextInt(10));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        Random random = new Random();
        while (true) {
            // 打印线程名称
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(random.nextInt(10));
            } catch (InterruptedException e) {
                // 随机停⽌运⾏ 0-9 秒
                e.printStackTrace();
            }
        }
    }
}
