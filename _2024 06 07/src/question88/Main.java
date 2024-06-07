package question88;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-07
 * Time: 16:50
 */


import java.util.*;
public class Main {
    static int INF = 0x3f3f3f3f;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] col = new int[n + 1];//存储颜色
        int[] sum = new int[n + 1];//前缀和
        int[][] cost = new int[n + 1][n + 1];//表示i 到 j 区间的花费
        int[][] nums = new int[n + 1][n + 1];//区间的堆数
        //读入数据
        for(int i = 1;i <= n;i++){
            sum[i] = sum[i - 1] + in.nextInt();
        }
        for(int i = 1;i <= n;i++){
            col[i] = in.nextInt();
        }
        //初始化
        int[][][] dp = new int[n + 1][n + 1][3];
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                nums[i][j] = j - i + 1;//独自成一堆
                Arrays.fill(dp[i][j],INF);//求最小值，防止被 0 干预
            }
            dp[i][i][col[i]] = 0;//只有自己且颜色存在
        }
        //填写 dp 表
        for(int len = 1;len <= n;len++){//枚举长度
            for(int i = 1;i + len - 1 <= n;i++){//枚举起点
                int end = i + len - 1;//找到终点
                for(int k = 0;k < 3;k++){//枚举颜色
                    for(int j = i;j < end;j++){//枚举分割点
                        if(dp[i][j][k] != INF && dp[j + 1][end][k] != INF){//去掉不存在的节点
                            dp[i][end][(k + 1) % 3] = Math.min(dp[i][end][(k + 1) % 3],dp[i][j][k] + dp[j + 1][end][k] + sum[end] - sum[i - 1]);
                            nums[i][end] = 1;//注意我们的状态就是表示合成一堆
                        }
                    }
                }
            }
        }
        //将堆数为 1 的花费填入 cost（只能填 1 ）
        for(int i = 1;i <= n;i++){
            for(int j = i;j <= n;j++){
                if(nums[i][j] == 1){
                    cost[i][j] = Math.min(dp[i][j][0],Math.min(dp[i][j][1],dp[i][j][2]));
                }
            }
        }
        //dp 表示是合成 1 堆，但是最后不一定能合成一堆，所以要再查找一次。
        //把所有区间都枚举出来，找到最小堆数的最小花费
        for(int k = 1;k <= n;k++){
            for(int i = 1;i <= k;i++){
                for(int j = k + 1;j <= n;j++){
                    if(nums[i][j] > nums[i][k] + nums[k + 1][j]){
                        nums[i][j] = nums[i][k] + nums[k + 1][j];
                        cost[i][j] = cost[i][k] + cost[k + 1][j];
                    }else if(nums[i][j] == nums[i][k] + nums[k + 1][j]){
                        cost[i][j] = Math.min(cost[i][j],cost[i][k] + cost[k + 1][j]);
                    }
                }
            }
        }
        System.out.println(nums[1][n] + " " + cost[1][n]);
    }
}
