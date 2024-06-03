package boke;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-03
 * Time: 21:34
 */
public class demo1 {
    static int count = 0;
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while(count == 0){
                System.out.print("");
            }
            System.out.println("t1.end");
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
