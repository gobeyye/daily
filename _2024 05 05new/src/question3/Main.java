package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-05
 * Time: 22:34
 */
import java.util.*;


public class Main {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 计算01背包问题的结果
     * @param V int整型 背包的体积
     * @param n int整型 物品的个数
     * @param vw int整型二维数组 第一维度为n,第二维度为2的二维数组,vw[i][0],vw[i][1]分别描述i+1个物品的vi,wi
     * @return int整型
     */
    public int knapsack (int V, int n, int[][] vw) {
        // write code here
        //1.创建 dp 表
        //2.初始化
        //3.填表
        //4.返回值
        int[][] dp = new int[n + 1][V + 1];
        for(int i = 1;i <= n;i++){
            for(int j = 0;j <= V;j++){
                dp[i][j] = dp[i - 1][j];
                if(j - vw[i - 1][0] >= 0){
                    dp[i][j] = Math.max(dp[i][j],dp[i - 1][j - vw[i - 1][0]] + vw[i - 1][1]);
                }
            }
        }
        return dp[n][V];
    }
}