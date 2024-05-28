package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-28
 * Time: 20:12
 */




import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
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
