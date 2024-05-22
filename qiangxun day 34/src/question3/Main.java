package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-22
 * Time: 21:21
 */
import java.util.*;


//public class Main {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 递增路径的最大长度
     * @param matrix int整型二维数组 描述矩阵的每个数
     * @return int整型
     */
//    int n,m;
//    boolean[][] vis;
//    int[] dx = {0,0,1,-1};
//    int[] dy = {1,-1,0,0};
//    public int solve (int[][] matrix) {
//        // write code here
//        n = matrix.length;
//        m = matrix[0].length;
//        vis = new boolean[n][m];
//        int ans = 0;//答案的长度
//        //1.遍历每个节点
//        for(int i = 0;i < n;i++){
//            for(int j = 0;j < m;j++){
//                //2.dfs 找最长
//                vis[i][j] = true;
//                int tmp = dfs(matrix,i,j,1);
//                vis[i][j] = false;
//                ans = Math.max(ans,tmp);
//            }
//        }
//        return ans;
//    }
//    public int dfs(int[][] matrix,int i,int j,int path){
//        int ret = path;
//        for(int k = 0;k < 4;k++){
//            int x = i + dx[k];
//            int y = j + dy[k];
//            if(x >= 0 && x < n && y >= 0 && y < m && matrix[i][j] < matrix[x][y]){
//                vis[x][y] = true;
//                ret = Math.max(ret,dfs(matrix,x,y,path + 1));
//                vis[x][y] = false;
//            }
//        }
//        return ret;
//    }
//}




import java.util.*;


public class Main {
/**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 递增路径的最大长度
     * @param matrix int整型二维数组 描述矩阵的每个数
     * @return int整型*/


    int n,m;
    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};
    int[][] memo;
    public int solve (int[][] matrix) {
        // write code here
        n = matrix.length;
        m = matrix[0].length;
        int ans = 0;//答案的长度
        memo = new int[1010][1010];
        //1.遍历每个节点
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                //2.dfs 找最长
                int tmp = dfs(matrix,i,j);
                ans = Math.max(ans,tmp);
            }
        }
        return ans;
    }
    public int dfs(int[][] matrix,int i,int j){
        if(memo[i][j] != 0){
            return memo[i][j];
        }
        int ret = 1;
        for(int k = 0;k < 4;k++){
            int x = i + dx[k];
            int y = j + dy[k];
            if(x >= 0 && x < n && y >= 0 && y < m && matrix[i][j] < matrix[x][y]){
                ret = Math.max(ret,dfs(matrix,x,y) + 1);
            }
        }
        memo[i][j] = ret;//存进备忘录
        return ret;//返回结果
    }
}
