/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-28
 * Time: 21:10
 */
public class question1 {
    int[][] grid;
    boolean[][] vis;
    int n;
    int m;
    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};
    int ret;
    public int uniquePathsIII(int[][] _grid) {
        grid = _grid;
        n = grid.length;
        m = grid[0].length;
        vis = new boolean[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(grid[i][j] == 1){
                    dfs(i,j);
                }
            }
        }
        return ret;
    }
    public void dfs(int i,int j){
        if(grid[i][j] == 2){
            if(panduan()){
                ret++;
            }
            return;
        }
        for(int k = 0;k < 4;k++){
            int x = i + dx[k];
            int y = j + dy[k];
            if(x >= 0 && x < n && y >= 0 && y < m && !vis[x][y]
                    && grid[x][y] != -1 && grid[x][y] != 1){
                vis[x][y] = true;
                dfs(x,y);
                vis[x][y] = false;
            }
        }
    }
    public boolean panduan(){
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(grid[i][j] == 1){
                    continue;
                }else if(grid[i][j] == 2){
                    continue;
                }else if(grid[i][j] == -1){
                    continue;
                }
                if(vis[i][j] == false){
                    return false;
                }

            }
        }
        return true;
    }
}
