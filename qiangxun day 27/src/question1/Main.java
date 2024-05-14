package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-14
 * Time: 21:12
 */
//不知道错哪了
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        int MOD = (int)1e9;
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        //1.创建 dp 表
        int m = in.nextInt(),n = in.nextInt();
        long[][] dp = new long[n][m];
        //2.初始化
        for(int i = 0;i < m;i++){
            dp[0][i] = 1;
        }
        //3.填表
        for(int i = 1;i < n;i++){
            for(int j = 0;j < m;j++){
                // dp[i][j]
                for(int k = 0; k < m;k++){
                    if(k != j){
                        dp[i][j] = (dp[i][j] + dp[i - 1][k]) % MOD;
                    }
                }
            }
        }
        long sum = 0;
        for(int i = 0;i < m;i++){
            sum = (sum + dp[n - 1][i]) % MOD;
        }
        //4.返回值
        System.out.println(sum);
    }
}