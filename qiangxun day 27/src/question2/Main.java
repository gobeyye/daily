package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-14
 * Time: 21:12
 */
//不知道错哪了
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static int x1;
    static int x2;
    static int y1;
    static int y2;
    static int n;
    static int m;
    static boolean[][] vis;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();m = in.nextInt();
        vis = new boolean[n][m];
        x1 = in.nextInt() - 1;y1 = in.nextInt() - 1;x2 = in.nextInt() - 1;y2 = in.nextInt() - 1;
        char[][] map = new char[n][m];
        for(int i = 0;i < n;i++){
            map[i] = in.next().toCharArray();
        }
        //1.dfs解决
        int ans = dfs(map,x1,y1,0);
        System.out.println(ans);
    }
    public static int dfs(char[][] map,int i,int j,int step){
        if(i == x2 && j == y2){
            return step;
        }
        vis[i][j] = true;
        int ans = Integer.MAX_VALUE;
        for(int k = 0;k < 4;k++){
            int x = i + dx[k];
            int y = j + dy[k];
            if(x >= 0 && x < n && y >= 0 && y < m && !vis[x][y] && map[x][y] == '.'){
                int tmp = dfs(map,x,y,step + 1);
                if(tmp != -1){
                    ans = Math.min(ans,tmp);
                }
                vis[x][y] = true;
            }
        }
        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
}
