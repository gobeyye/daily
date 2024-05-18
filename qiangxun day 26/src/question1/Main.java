package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-13
 * Time: 19:20
 */
import java.util.Scanner;
// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1.创建 dp 表
        //2.初始化
        //3.填表
        //4.返回值
        char[] s = in.next().toCharArray();
        int n = s.length;
        boolean[][] dp = new boolean[n][n];
        int minLen = 105;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s[i] == s[j]) {//大前提是chi 和 chj 对应的字符要相同
                    dp[i][j] = (j > i + 1) ? dp[i + 1][j - 1] : true;
                    if (dp[i][j] == true && j - i + 1 >= 2) {
                        minLen = Math.min(minLen, j - i + 1);
                        // System.out.println("i:" + i + " " + "j:" + j);
                    }
                }

            }
        }
        System.out.println(minLen == 105 ? -1 : minLen);
    }
}