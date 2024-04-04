package leetcode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-04
 * Time: 10:16
 */
public class question1 {
    int n;
    int m;
    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};
    int[][] dp;
    public int longestIncreasingPath(int[][] matrix) {
        n = matrix.length;
        m = matrix[0].length;
        dp = new int[n][m];
        int ret = 0;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                ret = Math.max(ret,dfs(i,j,matrix));
            }
        }
        return ret;
    }
    public int dfs(int i,int j,int[][] matrix){
        int ret =  1;
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        for(int k = 0;k < 4;k++){
            int x = i + dx[k];
            int y = j + dy[k];
            if(x >= 0 && x < n && y >= 0 && y < m && matrix[i][j] < matrix[x][y]){
                ret = Math.max(ret,dfs(x,y,matrix) + 1);
            }
        }
        dp[i][j] = ret;
        return ret;

    }
}
