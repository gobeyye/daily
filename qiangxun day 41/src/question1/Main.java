package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-30
 * Time: 20:52
 */
import java.util.*;


public class Main {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param A int整型二维数组
     * @param f int整型二维数组
     * @return int整型二维数组

     */
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    public int[][] flipChess (int[][] A, int[][] f) {
        // write code here
        int n = f.length;
        for(int i = 0;i < n;i++){
            int x = f[i][0] - 1, y = f[i][1] - 1;
            for(int k = 0;k < 4;k++){
                int sr = x + dx[k];
                int sc = y + dy[k];
                if(sr >= 0 && sr <= 3 && sc >= 0 && sc <= 3){
                    A[sr][sc] = (A[sr][sc] + 1) % 2;
                }
            }

        }
        return A;
    }
}
