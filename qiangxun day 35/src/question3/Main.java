package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-23
 * Time: 22:23
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] s1 = (" " + in.next()).toCharArray();
        char[] s2 = (" " + in.next()).toCharArray();
        int n = s1.length - 1,m = s2.length - 1;
        //dp
        //1.求最长公共子序列
        //1.1 创建 dp 表
        int[][] dp = new int[n + 1][m + 1];
        //1.2 初始化
        //1.3 填表
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= m;j++){
                if(s1[i] == s2[j]){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else{
                    //不相等
                    dp[i][j] = Math.max(dp[i][j - 1],dp[i - 1][j]);
                }
            }
        }
        //1.4 返回值
        int maxLen = dp[n][m];
        //2.max(l1,l2) - maxLen
        System.out.println(Math.max(n,m) - maxLen);
    }
}