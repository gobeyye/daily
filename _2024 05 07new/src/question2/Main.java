package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-07
 * Time: 21:22
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1.创建 dp 表开long
        //2.初始化
        //3.填表
        //4.返回值
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        long[] dp = new long[n];
        dp[0] = nums[0];
        for(int i = 1;i < n;i++){
            dp[i] = nums[i];
            dp[i] = Math.max(dp[i],nums[i] + dp[i - 1]);
        }
        long max = Long.MIN_VALUE;
        for(int i = 0;i < n;i++){
            max = Math.max(dp[i],max);
        }
        System.out.println(max);

    }
}
