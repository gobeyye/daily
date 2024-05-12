package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-12
 * Time: 21:17
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1.求出sum，如果sum是奇数直接false
        int n = in.nextInt();
        int[] nums = new int[n + 1];
        int sum = 0;
        for(int i = 1;i <= n;i++){
            nums[i] = in.nextInt();
            sum += nums[i];
        }
        if(sum % 2 == 1){
            //奇数的情况
            System.out.println("false");
            return;
        }
        int V = sum / 2;

        //2.01背包问题
        //3.创建 dp 表
        boolean[][] dp = new boolean[n + 1][V + 1];
        //4.初始化
        dp[0][0] = true;
        //5.填表
        for(int i = 1;i <= n;i++){
            for(int j = 0;j <= V;j++){
                if(dp[i - 1][j] == true){
                    dp[i][j] = true;
                }
                if(j >= nums[i] && dp[i - 1][j - nums[i]] == true){
                    dp[i][j] = true;
                }
            }
        }
        //6.返回值
        System.out.println(dp[n][V]);
    }
}
