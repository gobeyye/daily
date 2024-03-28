package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-27
 * Time: 19:51
 */
import java.util.*;
public class Main{
    static int[][] map;
    static int n;
    static boolean[][] vis;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        map = new int[n + 1][n + 1];
        vis = new boolean[n + 1][n + 1];
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                map[i][j] = in.nextInt();
            }
        }
        for(int i = 1;i <= n;i++){
            vis[i][1] = true;
            vis[i][n] = true;
            vis[1][i] = true;
            vis[n][i] = true;
            if(map[i][1] != 1){
                dfs(i,1);
            }
            if(map[i][n] != 1){
                dfs(i,n);
            }
            if(map[1][i] != 1){
                dfs(1,i);
            }
            if(map[n][i] != 1){
                dfs(n,i);
            }
        }
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                if(map[i][j] == 0 && !vis[i][j]){
                    map[i][j] = 2;
                }
            }
        }
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void dfs(int i,int j){
        for(int k = 0;k < 4;k++){
            int x = i + dx[k];
            int y = j + dy[k];
            if(x >= 1 && x <= n && y >= 1 && y <= n && !vis[x][y] && map[x][y] == 0){
                vis[x][y] = true;
                dfs(x,y);
            }
        }

    }
}
