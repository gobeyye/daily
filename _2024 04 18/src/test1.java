/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-18
 * Time: 21:59
 */
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
import java.util.*;
import java.io.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class test1 {
    static int maxTime;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static int[][] map;
    static int n;
    static int m;
    public static void main(String[] args) {
        // write code here
        n = 3;
        m = 3;
        map = new int[][]{{2,1,1},{1,0,1},{1,1,1}};

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(map[i][j] == 2){
                    dfs(i,j,0);
                }
            }
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(map[i][j] == 1){
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(maxTime);
    }
    public static void dfs(int i,int j,int step){
        maxTime = Math.max(maxTime,step);
        map[i][j] = 2;
        for(int k = 0;k < 4;k++){
            int x = i + dx[k];
            int y = j + dy[k];
            if(x >= 0 && x < n && y >= 0 && y < m && map[x][y] == 1){
                dfs(x,y,step + 1);
            }
        }
    }



}

