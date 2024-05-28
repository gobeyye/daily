/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int n = 9383;
        int count = 0;
        while (n != 0) {
            //1.求出 n 的根号 x
            int x = (int)Math.sqrt(n);
            //2.n - Pow（x）
            // n = n - (int)Math.pow(x);
            n = n - ((int)Math.pow(x,2));
            //统计个数
            count++;
            //3.是否为0
            //4.为0返回，不为0继续1，2步骤
        }
        System.out.println(count);

    }
}