package boke;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-03
 * Time: 23:02
 */
public class demo2 {
    public volatile static int count = 0;
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("t start");
            while(count == 0){

            }
            System.out.println("t end");
        });
        Thread t2 = new Thread(() -> {
            Scanner in = new Scanner(System.in);
            System.out.println("请输入一个数字:");
            count = in.nextInt();
        });
        t1.start();
        t2.start();
    }
}
