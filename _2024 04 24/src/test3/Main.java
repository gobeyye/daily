package test3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-24
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
        int n = in.nextInt(), m = in.nextInt(), x = in.nextInt(), y = in.nextInt();
        n++;
        m++;
        x++;
        y++;
        int[][] dp = new int[n + 1][m + 1];
        dp[0][1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if ((Math.abs(i - x) + Math.abs(j - y) == 3) && i != x && j != y || (i == x && j == y)) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}
