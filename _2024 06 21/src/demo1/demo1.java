package demo1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-21
 * Time: 10:44
 */
public class demo1 {
    public static int maxEnvelopes(int[][] envelopes) {
        //动态规划
        int n = envelopes.length;
        //排序排序
        Arrays.sort(envelopes,(o1, o2) -> {
            if(o1[0] != o2[0]){
                if(o1[0] > o2[0]) return -1;//降序
                else{
                    return 1;
                }
            }else{
                //相等的情况
                if(o1[1] > o2[1]) return -1;
                else if(o1[1] == o2[1]) return 0;//前后连个数都相等
                else return 1;
            }
        });
        //1.创建 dp 表
        int[] dp = new int[n];
        //2.初始化
        // Arrays.fill(dp,1);
        dp[0] = 1;
        //3.填表
        for(int i = 1;i < n;i++){
            for(int j = i - 1;j >= 0;j--){
                if(envelopes[i][0] < envelopes[j][0] && envelopes[i][1] < envelopes[j][1]){
                    dp[i] = Math.max(dp[j] + 1,dp[i]);
                }
            }
        }
        //4.返回值
        int result = 0;
        for(int i = 0;i < n;i++){
            result = Math.max(result,dp[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] nums = {{10,8},{1,12},{6,15},{2,18}};
        maxEnvelopes(nums);
        System.out.println();
    }
}
