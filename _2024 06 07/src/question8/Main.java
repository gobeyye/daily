package question8;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-07
 * Time: 16:28
 */
//java

import java.io.*;
import java.util.*;

public class Main {
    static int maxn = 200005, n, m, inf = (int) 1e9;
    static long INF = (long) 2e18, ans = 0, mod = (int) 1e9 + 7;
    static Scanner sc = new Scanner(System.in);
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static StreamTokenizer st = new StreamTokenizer(bf);
    static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        solve();
        pw.flush();
    }

    static final int I() throws IOException {
        st.nextToken();
        return (int) st.nval;
    }

    static int dp[][][] = new int[303][303][3];
    static int num[][] = new int[303][303];
    static int a[] = new int[301];
    static int sum[] = new int[301]; //前缀和
    static int c[] = new int[301];
    static int cost[][] = new int[303][303];

    static void solve() throws IOException {
        n = I();
        for (int i = 1; i <= n; i++)
            for (int j = i; j <= n; j++) {
                num[i][j] = j - i + 1;
                for (int k = 0; k < 3; k++) dp[i][j][k] = inf;
            }
        for (int i = 1; i <= n; i++) a[i] = I();
        for (int i = 1; i <= n; i++) sum[i] = a[i] + sum[i - 1]; //前缀和，方便统计区间
        for (int i = 1; i <= n; i++) c[i] = I();//颜色
        for (int i = 1; i <= n; i++) dp[i][i][c[i]] = 0; //初始石子堆花费显然为0
        for (int len = 1; len <= n; len++)
            for (int i = 1; i + len - 1 <= n; i++) {
                int j = i + len - 1;
                for (int col = 0; col < 3; col++) {
                    int min = inf;
                    for (int k = i; k < j; k++) {
                        if (dp[i][k][col] != inf && dp[k + 1][j][col] != inf) {
                            min = Math.min(min, dp[i][k][col] + dp[k + 1][j][col]);
                        }
                    }
                    if (min == inf) continue;
                    num[i][j] = 1;
                    dp[i][j][(col + 1) % 3] = Math.min(dp[i][j][(col + 1) % 3], min + sum[j] - sum[i - 1]);
                }
            }
        for (int i = 1; i <= n; i++)
            for (int j = i; j <= n; j++)
                if (num[i][j] == 1) cost[i][j] = Math.min(dp[i][j][0], Math.min(dp[i][j][1], dp[i][j][2]));
        for (int k = 1; k <= n; k++) //类似floyd计算花费
            for (int i = 1; i <= k; i++)
                for (int j = k + 1; j <= n; j++) {
                    if (num[i][j] > num[i][k] + num[k + 1][j]) {
                        num[i][j] = num[i][k] + num[k + 1][j];
                        cost[i][j] = cost[i][k] + cost[k + 1][j];
                    } else if (num[i][j] == num[i][k] + num[k + 1][j]) {
                        cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost[k + 1][j]);
                    }
                }
        pw.println(num[1][n] + " " + cost[1][n]);
    }
}
