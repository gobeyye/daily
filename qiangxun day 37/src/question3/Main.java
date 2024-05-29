package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-27
 * Time: 9:03
 */







import java.util.*;
import java.io.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static int n,m;
    static int[][] dp;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();m = in.nextInt();
        dp = new int[n][m];
        int[][] arr = new int[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                arr[i][j] = in.nextInt();
            }
        }
        int ret = 1;//表示答案
        //1.遍历整个矩阵
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                //2.dfs找最大
                ret = Math.max(ret,dfs(arr,i,j));
            }
        }

        //3.返回结果
        System.out.println(ret);
    }
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    public static int dfs(int[][] arr,int i,int j){
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        int ans = 1;
        for(int k = 0;k < 4;k++){
            int x = i + dx[k];
            int y = j + dy[k];
            if(x >= 0 && x < n && y >= 0 && y < m && arr[x][y] < arr[i][j]){
                ans = Math.max(dfs(arr,x,y) + 1,ans);
            }
        }
        dp[i][j] = ans;
        return ans;
    }
}
