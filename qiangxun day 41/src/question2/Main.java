package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-30
 * Time: 20:52
 */


import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //dp
        //1.创建 dp 表
        int n = in.nextInt();
        int[] arr = new int[n + 1];
        for(int i = 1;i <= n;i++){
            arr[i] = in.nextInt();
        }
        long[][] dp = new long[n + 1][4];
        //2.初始化
        //3.填表
        for(int i = 1;i <= n;i++){
            // for(int j = 1;j <= 3;j++){
            dp[i][1] = Math.max(dp[i - 1][1],dp[i - 1][3]);
            dp[i][2] = dp[i - 1][1] + arr[i];
            dp[i][3] = dp[i - 1][2];
            // }
        }
        long max = 0;
        //4.返回值
        for(int i = 1;i <= 3;i++){
            max = Math.max(max,dp[n][i]);
        }
        System.out.println(max);
    }
}
