package question10;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-13
 * Time: 20:07
 */
import java.util.*;

public class Main {
    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static final int N = 16;
    static int n, m;
    static int[][] sumx = new int[N][N];
    static int[][] usedx = new int[N][N];
    static int[][] lenx = new int[N][N];
    static int[][] sumy = new int[N][N];
    static int[][] usedy = new int[N][N];
    static int[][] leny = new int[N][N];
    static int[][] in = new int[N][N];
    static int[][] ans = new int[N][N];
    static int[][][] dp = new int[N][50][1030];
    static int[][][] cc = new int[N][50][1030];
    static int[] lb = new int[1030];
    static int[] mp = new int[1030];
    static int ss;
    static List<Pair> pos = new ArrayList<>();

    static int calc(int len, int sum, int used) {
        if (cc[len][sum][used] != 0) return dp[len][sum][used];
        cc[len][sum][used] = 1;
        if (len == 0) {
            if (sum == 0) return dp[len][sum][used] = 1;
            return dp[len][sum][used] = 0;
        }
        if (sum == 0) return dp[len][sum][used] = 0;
        for (int i = 0; i < 9; i++) {
            if ((used & (1 << i)) != 0 && i + 1 <= sum) {
                if (calc(len - 1, sum - i - 1, used ^ (1 << i)) != 0) return dp[len][sum][used] = 1;
            }
        }
        return dp[len][sum][used] = 0;
    }

    static boolean dfs(int cur) {
        if (cur == pos.size()) return true;
        int x = pos.get(cur).first;
        int y = pos.get(cur).second;
        int lft = usedx[x][y] & usedy[x][y];
        if (calc(lenx[x][y], sumx[x][y], usedx[x][y]) == 0 || calc(leny[x][y], sumy[x][y], usedy[x][y]) == 0) return false;
        int i = lb[lft];
        while (lft != 0 && i + 1 <= sumx[x][y] && i + 1 <= sumy[x][y]) {
            lft ^= 1 << i;
            usedx[x + 1][y] = usedx[x][y] ^ (1 << i);
            usedy[x][y + 1] = usedy[x][y] ^ (1 << i);
            sumx[x + 1][y] = sumx[x][y] - i - 1;
            sumy[x][y + 1] = sumy[x][y] - i - 1;
            lenx[x + 1][y] = lenx[x][y] - 1;
            leny[x][y + 1] = leny[x][y] - 1;
            if (calc(lenx[x + 1][y], sumx[x + 1][y], usedx[x + 1][y]) != 0 && calc(leny[x][y + 1], sumy[x][y + 1], usedy[x][y + 1]) != 0 && dfs(cur + 1)) {
                ans[x][y] = i + 1;
                return true;
            }
            i = lb[lft];
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 2; i < 1024; i++) mp[i] = mp[i / 2] + 1;
        for (int i = 1; i < 1024; i++) lb[i] = mp[i & (i - 1) ^ i];
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ss = sc.nextInt();
                if (ss == 1) {
                    pos.add(new Pair(i, j));
                    in[i][j] = 1;
                } else {
                    int s1 = sc.nextInt();
                    int s2 = sc.nextInt();
                    if (s1 != -1) sumx[i + 1][j] = s1;
                    if (s2 != -1) sumy[i][j + 1] = s2;
                }
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (in[i][j] != 0) {
                    usedx[i][j] = (1 << 9) - 1;
                    usedy[i][j] = (1 << 9) - 1;
                    lenx[i][j] = lenx[i + 1][j] + 1;
                    leny[i][j] = leny[i][j + 1] + 1;
                }
            }
        }
        dfs(0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ans[i][j] != 0) System.out.print(ans[i][j] + " ");
                else System.out.print("_ ");
            }
            System.out.println();
        }
    }
}
