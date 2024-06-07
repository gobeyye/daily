package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-07
 * Time: 15:11
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //读入数据
        int n = in.nextInt();
        int[][] dp = new int[n + 1][n + 1];
        int[] sum = new int[n + 1];
        //初始化
        for (int i = 1; i <= n; i++) {
            Arrays.fill(dp[i], 0x3f3f3f3f);
            sum[i] = sum[i - 1] + in.nextInt();
            dp[i][i] = 0;
        }
        for (int len = 1; len <= n; len++) {//枚举长度
            for (int i = 1; i + len - 1 <= n; i++) {//枚举起点
                int end = i + len - 1;
                for (int j = i; j < end; j++) {//枚举分割点
                    dp[i][end] = Math.min(dp[i][end], dp[i][j] + dp[j + 1][end] + sum[end] - sum[i - 1]);
                }
            }

        }
        System.out.println(dp[1][n]);
    }
}
