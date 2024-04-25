package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-25
 * Time: 19:54
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1.创建 dp 表
        //2.初始化
        //3.填表
        //4.返回值
        int n = in.nextInt();
        if(n == 0){
            System.out.println(0);
            return;
        }
        int[] f = new int[n + 1];
        int[] g = new int[n + 1];
        int[] prices = new int[n + 1];
        for(int i = 1;i <= n;i++){
            prices[i] = in.nextInt();
        }
        f[1] = -prices[1];
        for(int i = 2;i <= n;i++){
            f[i] = Math.max(f[i - 1],g[i - 1] + prices[i]);
            g[i] = Math.max(g[i - 1],f[i - 1] - prices[i]);
        }
        System.out.println(g[n]);
    }
}
