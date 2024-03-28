package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-27
 * Time: 19:04
 */
import java.util.*;
public class Main{
    static int ret;
    static int fx;
    static int fy;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static boolean[][] vis;
    static int[][] obsta;
    static int T;
    static int M;
    static int N;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        T = in.nextInt();
        int sx = in.nextInt();
        int sy = in.nextInt();
        fx = in.nextInt();
        fy = in.nextInt();
        vis = new boolean[N + 1][M + 1];
        obsta = new int[T + 1][2];
        for(int i = 1;i <= T;i++){
            obsta[i][0] = in.nextInt();
            obsta[i][1] = in.nextInt();
        }
        vis[sx][sy] = true;
        dfs(sx,sy);
        System.out.println(ret);
    }
    public static void dfs(int i,int j){
        if(i == fx && j == fy){
            ret++;
            return;
        }
        for(int k = 0;k < 4;k++){
            int x = i + dx[k];
            int y = j + dy[k];
            if(x >= 1 && x <= N && y >= 1 && y <= M && !vis[x][y] &&
                    !check(x,y)){
                vis[x][y] = true;
                dfs(x,y);
                vis[x][y] = false;
            }
        }

    }
    public static boolean check(int dx,int dy){
        for(int i = 1;i <= T;i++){
            if(obsta[i][0] == dx && obsta[i][1] == dy){
                return true;
            }
        }
        return false;
    }
}
