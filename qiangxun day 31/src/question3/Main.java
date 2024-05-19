package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-19
 * Time: 21:36
 */
import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1.全部相加 求sum，如果为奇数直接No
        String s = in.next();
        int n = s.length();
        int[] nums = new int[n];
        int sum = 0;
        for(int i = 0;i < n;i++){
            nums[i] = s.charAt(i) - '0';
            sum += nums[i];
        }
        if(sum % 2 != 0){
            System.out.println("No");
            return;
        }
        sum /= 2;
        //2.01 背包
        //1.创建 dp 表
        boolean[][] dp = new boolean[n + 1][sum + 1];
        //2.初始化
        dp[0][0] = true;
        for(int i = 1;i <= n;i++){
            for(int j = 0;j <= sum;j++){
                if(dp[i - 1][j] == true){
                    dp[i][j] = true;
                }
                if(j - nums[i - 1] >= 0 && dp[i - 1][j - nums[i - 1]] == true){
                    dp[i][j] = true;
                }
            }
        }


        //3.填表

        //4.返回值
        if(dp[n][sum] == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}