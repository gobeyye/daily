package demo1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-25
 * Time: 9:50
 */
public class Main{
    static int n,m,t,u,v;
    static int[][] a = new int[19][19];
    static long ans;
    static long[][] f = new long[600001][19];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),m = in.nextInt();
        t = 1 << n;
        for(int i = 1;i <= m;i++){
            u = in.nextInt() - 1;v = in.nextInt() - 1;
            a[u][v] = a[v][u] = 1;
        }
        for(int i = 0;i < n;i++){
            f[1 << i][i] = 1;
        }
        for(int i = 1;i <= t;i++){
            for(int j = 0;j < n;j++){
                if(f[i][j] == 0) continue;
                for(int k = 0;k < n;k++){
                    if(a[j][k] == 0) continue;
                    if((i & -i) > (1 << k)) continue;
                    if(((1 << k) & i) != 0){
                        if((1 << k) == (i & -i)){
                            ans += f[i][j];
                        }else f[i | 1 << k][k] += f[i][j];
                    }
                }
            }
        }
        System.out.println((ans - m) / 2);
    }
}