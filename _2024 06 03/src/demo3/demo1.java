package demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-03
 * Time: 16:43
 */
import java.util.*;
public class demo1 {
    private volatile static int count = 0;
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while(count == 0){

            }
            System.out.println("t end");
        });
        Thread t2 = new Thread(() -> {
            Scanner in = new Scanner(System.in);
            System.out.println("请输入一个整数");
            count = in.nextInt();
        });
        t1.start();
        t2.start();
    }
}
