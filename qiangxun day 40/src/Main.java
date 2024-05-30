/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //输入数据
        int n = in.nextInt(),k = in.nextInt();
        long[] arr = new long[n + 1];
        for(int i = 1;i <= n;i++){
            arr[i] = in.nextLong();
        }
        //1.创建 dp 表
        long[][] dp = new long[n + 1][k];

        //2.初始化
        Arrays.fill(dp[0],-0x3f3f3f3f);
        dp[0][0] = 0;
        //3.填表
        for(int i = 1;i <= n;i++){
            for(int j = 0;j < k;j++){
                dp[i][j] = dp[i - 1][j];
                dp[i][j] = Math.max(dp[i][j],dp[i - 1][(int)(j - arr[i] % k + k) % k] + arr[i]);
            }
        }
        //4.返回值
        System.out.println(dp[n][0]);
    }
}