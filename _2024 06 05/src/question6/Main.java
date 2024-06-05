package question6;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-05
 * Time: 15:31
 */


import java.util.*;

public class Main {
    static int N = 180;//用来创建矩阵
    static int a[][] = new int[N][N];//a 用来保存最后拼接的结果
    static int b[][] = new int[55][55];// 另一个矩形
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        //读入第一个矩阵
        for (int i = 1 + n; i <= n * 2; i++) {
            for (int j = 1 + n; j <= n * 2; j++) {
                a[i][j] = in.nextInt();
            }
        }
        //读入第二个矩形
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                b[i][j] = in.nextInt();
            }
        }
        int ans = 0;
        int[][] g = new int[N][N];
        for (int x = 0; x < 4; x++) {//枚举翻转的四个方向
            for (int k = 2; k <= 2 * n; k++) {//偏移位置
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        g[i][j] = a[i][j];//将 a 拷贝给 g
                    }
                }
                for (int i = 1; i <= n; i++) {
                    for (int j = k; j <= n + k; j++) {//上下
                        g[i][j] = b[i][j - k + 1];
                        g[i + 2 * n][j] = b[i][j - k + 1];
                    }
                }
                int top = 1, bottom = 2 * n, left, right;//bfs 的边界
                if (k <= n) {
                    left = k;
                    right = 2 * n;
                } else {
                    left = n + 1;
                    right = k + n - 1;//画图
                }
                ans = Math.max(ans, bfs(g, left, right, top, bottom));//bfs 找最大联通块
                ans = Math.max(ans, bfs(g, left, right, top + n, bottom + n));
            }
            //和上面的一样不过就是填左右
            for (int k = 2; k <= 2 * n; k++) {
                for (int i = 0; i < N; i++) {
                    g[i] = Arrays.copyOf(a[i], N);
                }
                for (int i = k; i <= n + k; i++) {
                    for (int j = 1; j <= n; j++) {//填写左右
                        g[i][j] = b[i - k + 1][j];
                        g[i][j + 2 * n] = b[i - k + 1][j];
                    }
                }
                int top, bottom, left = 1, right = 2 * n;
                if (k <= n) {
                    top = k;
                    bottom = 2 * n;
                } else {
                    top = n + 1;
                    bottom = n + k - 1;
                }
                ans = Math.max(ans, bfs(g, left, right, top, bottom));
                ans = Math.max(ans, bfs(g, left + n, right + n, top, bottom));
            }
            rotateMatrix();//翻转矩阵
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    b[i][j] = rotate[i][j];//翻转 b 即可
                }
            }
        }
        System.out.println(ans);
    }

    static int[][] rotate = new int[N][N];

    static void rotateMatrix() {//翻转矩阵
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                rotate[j][n - i + 1] = b[i][j];
            }
        }
    }


    //简单的 bfs 求最大联通块
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static int bfs (int[][] map,int left,int right,int top,int bottom){
        int ret = 0;//存储最终结果
        boolean[][] vis = new boolean[N][N];
        Queue<int[]> q = new LinkedList<>();
        int path = 0;
        for(int i = top;i <= bottom;i++){
            for(int j = left;j <= right;j++){
                if(map[i][j] == 1 && !vis[i][j]){
                    path = 0;
                    q.add(new int[]{i,j});
                    while(!q.isEmpty()){
                        int[] tmp = q.poll();
                        int sr = tmp[0],sc = tmp[1];
                        path++;
                        vis[sr][sc] = true;
                        for(int k = 0;k < 4;k++){
                            int x = sr + dx[k];
                            int y = sc + dy[k];
                            if(x >= top && x <= bottom && y >= left && y <= right && !vis[x][y] &&
                            map[x][y] == 1){
                                q.add(new int[]{x,y});
                                vis[x][y] = true;
                            }
                        }
                    }
                    ret = Math.max(ret,path);
                }
            }
        }
        return ret;
    }
}
