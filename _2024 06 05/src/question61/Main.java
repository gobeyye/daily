package question61;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-05
 * Time: 16:33
 */



import java.util.*;
public class Main {
    static int N = 200;
    static int[][] a;
    static int[][] b;
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int[N][N];
        b = new int[N][N];
        //读入第一个矩阵
        for(int i = n + 1;i <= 2 * n;i++){
            for(int j = n + 1;j <= 2 * n;j++){
                a[i][j] = in.nextInt();
            }
        }
        for(int i = 1;i <= n;i++){
            for(int j = 1; j <= n;j++){
                b[i][j] = in.nextInt();
            }
        }
        int ans = 0;
        for(int x = 0;x < 4;x++){
            int[][] g = new int[N][N];
            for(int k = 2;k < 2 * n;k++){
                //这是是否能优化
                for(int i = 0;i < N;i++){//读入a
                    for(int j = 0;j < N;j++){
                        g[i][j] = a[i][j];
                    }
                }
                for(int i = 1;i <= n;i++){
                    for(int j = k;j <= n + k;j++){
                        g[i][j] = b[i][j - k + 1];
                        g[i + 2 * n][j] = b[i][j - k + 1];
                    }
                }
                int top = 1, bottom = 2 * n, left, right;
                if(k <= n){

                }
            }
        }
    }
}
