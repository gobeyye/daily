package demo2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-14
 * Time: 16:14
 */
public class demo3 {
    static int n,m;
    static boolean[][] vis;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};


    public static void main(String[] args) {
//        int n = 3;
//        int m = 4;
//        vis = new boolean[n][m];
//        int ans = bfs(maze,entrance[0],entrance[1]);


    }

    public static int bfs(char[][] maze,int i,int j){
        if((i == 0 || i == n- 1) && (m == 0 || m == m - 1)){
            return 0;//处理边界
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i,j});
        int path = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            path++;//向外扩展一层
            for(int t = 0;t < size;t++){
                int[] tmp = queue.poll();
                int a = tmp[0],b = tmp[1];
                vis[a][b] = true;
                for(int k = 0;k < 4;k++){
                    int x = a + dx[k];
                    int y = b + dy[k];
                    if(x >= 0 && x < n && y >= 0 && y < m && maze[x][y] == '.' &&
                            !vis[x][y]){
                        if(x == 0 || x == n - 1 || y == 0 || y == m - 1){
                            return path;
                        }
                        queue.offer(new int[]{x,y});
                        vis[x][y] = true;
                    }
                }
            }

        }
        return -1;

    }

}
