package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-16
 * Time: 21:33
 */
import java.util.*;


public class Main {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 该数组最长严格上升子序列的长度
     * @param a int整型一维数组 给定的数组
     * @return int整型
     */
    public int LIS (int[] a) {
        // write code here
        int n = a.length;
        if(n == 0){
            return 0;
        }
        //1.创建 dp 表
        //2.初始化
        //3.填表
        //4.返回值
        int[] dp = new int[n];
        dp[0] = 1;
        int max = 1;
        for(int i = 1;i < n;i++){
            dp[i] = 1;
            for(int j = i - 1;j >= 0;j--){
                if(a[i] > a[j]){
                    dp[i] = Math.max(dp[i],dp[j] + 1);
                }
            }
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
