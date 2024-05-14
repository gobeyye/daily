package demo1;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-14
 * Time: 13:25
 */
public class Main {
    public static long sum1 = 0;
    public static long sum2 = 0;
    public static void main(String[] args) throws InterruptedException {
        long begin = System.nanoTime();
        int[] nums = new int[10000000];
        Random t = new Random();
        for(int i = 0;i < 10000000;i++){
            nums[i] = t.nextInt(100) + 1;
        }
        Thread t1 = new Thread(() -> {
            //偶数
            //不能使用变量捕获，因为这个数是会变的
            for(int i = 0;i < 10000000;i += 2){
                sum2 += nums[i];
            }
        });
        Thread t2 = new Thread(() -> {
            //奇数
            for(int i = 1;i < 10000000;i += 2){
                sum1 += nums[i];
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        long end = System.nanoTime();
        System.out.println("运行时间为：" + (end - begin));
        System.out.println("计算结果为：" + sum1 + sum2);
    }
}
