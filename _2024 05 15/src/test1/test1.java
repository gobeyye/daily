package test1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-15
 * Time: 13:02
 */
class cmp implements Comparator<Integer>{
    int a = 3;
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 * a - o2 * a;
    }
}
public class test1 {
    int n,m;
    boolean[][] vis;
    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};
    public int nearestExit(char[][] maze, int[] entrance) {
        //使用dfs解决
        n = maze.length;
        m = maze[0].length;
        vis = new boolean[n][m];
        int ans = dfs(maze,entrance[0],entrance[1],0);
        return ans;
    }
    public int dfs(char[][] maze,int i,int j,int step){
        //注意回溯
//        if(i == 0 || j == n - 1 || i == 0 || j == m - 1){
//            return step;//注意有个-1
//        }
        if(i == 0 || i == n - 1 || j == 0 || j == m - 1){
            return step;//注意有个-1
        }
        vis[i][j] = true;
        int ans = Integer.MAX_VALUE;
        for(int k = 0;k < 4;k++){
            int x = i + dx[k];
            int y = j + dy[k];
            if(x >= 0 && x < n && y >= 0 && y < m &&
                    !vis[x][y] && maze[x][y] == '.'){
                vis[x][y] = true;
                int path = dfs(maze,x,y,step + 1);
                if(path != -1){
                    ans = Math.min(ans,path);
                }
                vis[x][y] = false;//回溯
            }
        }
        vis[i][j] = false;
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
