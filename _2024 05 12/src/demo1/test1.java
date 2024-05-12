package demo1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-12
 * Time: 15:51
 */
class Solution
{
    int[] dx = {0, 0, -1, 1};
    int[] dy = {1, -1, 0, 0};
    boolean[][] vis = new boolean[301][301];
    int m, n;
    public int numIslands(char[][] grid)
    {
        m = grid.length; n = grid[0].length;
        int ret = 0;
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(grid[i][j] == '1' && !vis[i][j])
                {
                    ret++;
                    bfs(grid, i, j);
                }
            }
        }
        return ret;
    }
    public void bfs(char[][] grid, int i, int j)
    {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        vis[i][j] = true;
        while(!q.isEmpty())
        {
            int[] t = q.poll();
            int a = t[0], b = t[1];
            for(int k = 0; k < 4; k++)
            {
                int x = a + dx[k], y = b + dy[k];
                if(x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == '1' &&
                        !vis[x][y])
                {
                    q.add(new int[]{x, y});
                    vis[x][y] = true;
                }
            }
        }
    }
}

public class test1 {
}
