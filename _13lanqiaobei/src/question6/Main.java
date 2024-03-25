package question6;

import java.util.Scanner;
public class Main{
    static int[][] map;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int ans = Integer.MIN_VALUE;
        map = new int[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                map[i][j] = in.nextInt();
            }
        }
        int limit = in.nextInt();
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                for(int x = i;x < n;x++){
                    for(int y = j;y < m;y++){
                        int min = findMin(i,j,x,y);
                        int max = findMax(i,j,x,y);
                        if(max - min <= limit){
                            ans = Math.max(ans,(x - i + 1) * (y - j + 1));
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
    public static int findMin(int i,int j,int x,int y){
        int min = Integer.MAX_VALUE;
        for(int n = i;n <= x;n++){
            for(int m = j;m <= y;m++){
                min = Math.min(min,map[n][m]);
            }
        }
        return min;
    }
    public static int findMax(int i,int j,int x,int y){
        int min = Integer.MIN_VALUE;
        for(int n = i;n <= x;n++){
            for(int m = j;m <= y;m++){
                min = Math.max(min,map[n][m]);
            }
        }
        return min;
    }
}































//import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-24
 * Time: 23:14
 */
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] map = new int[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                map[i][j] = in.nextInt();
            }
        }
        int limit = in.nextInt();
        int maxAns = 0;
        int maxMap = Integer.MIN_VALUE;
        int minMap = Integer.MAX_VALUE;
        for(int row = 0;row < n;row++){
            for(int col = 0;col < m;col++){


            }
        }

    }
}*/








/*
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
// 枚举行x1,x2,二分最大的列数len,维护滑动窗口为大小为len的最大值和最小值
// 单调队列+二分
public class Main {
    // 矩阵中最大值-最小值<=limit && 元素个数最多
    static int n, m, limit, ans;
    static int[][][] max, min;
    //max[k][i][j]代表的含义是在第k列中，第i个元素到第j个的元素最大值是多少，min数组同理。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); m = sc.nextInt();
        max = new int[m + 1][n + 1][n + 1]; min = new int[m + 1][n + 1][n + 1];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                max[j][i][i] = min[j][i][i] = sc.nextInt();
        limit = sc.nextInt();

        for (int k = 1; k <= m; k++)
            for (int i = 1; i <= n; i++)
                for (int j = i + 1; j <= n; j++) {
                    max[k][i][j] = Math.max(max[k][j][j], max[k][i][j - 1]);
                    min[k][i][j] = Math.min(min[k][j][j], min[k][i][j - 1]);
                }

        for (int x1 = 1; x1 <= n; x1++)
            for (int x2 = x1; x2 <= n; x2++) {
                int l = 1, r = m;
                while (l < r) {
                    int mid = l + r + 1 >> 1;
                    if (check(x1, x2, mid)) l = mid;
                    else r = mid - 1;
                }
                if (check(x1, x2, r)) ans = Math.max(ans, (x2 - x1 + 1) * r);
            }
        System.out.println(ans);
    }

    private static boolean check(int x1, int x2, int k) {
        Deque<Integer> q_min = new ArrayDeque<>();
        Deque<Integer> q_max = new ArrayDeque<>();
        // 枚举所有列
        for (int i = 1; i <= m; i++) {
            if (!q_min.isEmpty() && i - k >= q_min.peekFirst()) q_min.pollFirst();
            while (!q_min.isEmpty() && min[i][x1][x2] <= min[q_min.peekLast()][x1][x2]) q_min.pollLast();
            q_min.addLast(i);

            if (!q_max.isEmpty() && i - k >= q_max.peekFirst()) q_max.pollFirst();
            while (!q_max.isEmpty() && max[i][x1][x2] >= max[q_max.peekLast()][x1][x2]) q_max.pollLast();
            q_max.addLast(i);
            //窗口大小为k
            if (i >= k && max[q_max.peekFirst()][x1][x2] - min[q_min.peekFirst()][x1][x2] <= limit) return true;
        }
        return false;
    }
}*/






















//import java.util.Scanner;
/*
public class Main{
    static int[][] arr;
    //暴力枚举
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int limit = scanner.nextInt();
        int max_area = Integer.MIN_VALUE;
        for (int i = N; i > 0; i--) {
            for (int j = M; j > 0; j--) { // i*j的矩阵
                for (int x = 0; x <= N - i; x++) {
                    for (int y = 0; y <= M - j; y++) { // 左上角坐标
                        int max = find_max(i, j, x, y);
                        int min = find_min(i, j, x, y);
                        if ((max - min) <= limit) {
                            max_area = Math.max(max_area, i * j);
                        }
                    }
                }
            }
        }
        System.out.println(max_area);
    }

    private static int find_min(int i, int j, int x, int y) {
        // 寻找最小值
        int res = Integer.MAX_VALUE;
        for (int n = x; n < x + i; n++) {
            for (int m = y; m < y + j; m++) {
                res = Math.min(res, arr[n][m]);
            }
        }
        return res;
    }

    private static int find_max(int i, int j, int x, int y) {
        // 寻找最大值
        int res = Integer.MIN_VALUE;
        for (int n = x; n < x + i; n++) {
            for (int m = y; m < y + j; m++) {
                res = Math.max(res, arr[n][m]);
            }
        }
        return res;
    }
}*/
