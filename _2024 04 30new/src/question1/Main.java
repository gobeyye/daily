package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-30
 * Time: 19:08
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long a = 1;
        long minNum = 0;
        long sub = Long.MAX_VALUE;
        while(a * a < x){
            if(Math.abs(a * a - x) < sub){
                minNum = a * a;
                sub = Math.abs(a * a - x);
            }
            a++;
        }
        if(Math.abs(a * a - x) < sub){
            minNum = a * a;
        }
        System.out.println(minNum);
    }
}
