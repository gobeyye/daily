package _7test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-22
 * Time: 16:26
 */









import java.util.*;
public class Main {
    static int[][] map;
    static boolean[] vis;
    static int n,m;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();m = in.nextInt();
        map = new int[n + 1][n + 1];
        for(int[] tmp:map){
            Arrays.fill(tmp,-1);
        }
        //输入路径
        //矩阵表达式
        for(int i = 0;i < m;i++){
            int u = in.nextInt(),v = in.nextInt(),w = in.nextInt();
            map[u][v] = w;
            map[v][u] = w;
        }
        long max = 0;
        vis = new boolean[n + 1];
        for(int i = 1;i <= n;i++){
            for(int j = i + 1;j <= n;j++){
                vis[i] = true;
                long tmp = dfs(i,j,0);//返回从 i 到 j 的最小值
                if(tmp == -1){
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max,tmp);
                vis[i] = false;
            }
        }
        System.out.println(max);
    }
    public static long dfs(int i,int j,long path){
        if(i == j){
            return path;//出口
        }
        long ret = Long.MAX_VALUE;
        for(int x = 1;x <= n;x++){
            if(!vis[x] && map[i][x] != -1){//必须要在没有找过的地方行动,同时还要有路才行
                vis[x] = true;
//                ret = Math.min(ret,dfs(x,j,path + map[i][x]));//值就不用回溯了
                long tmp = dfs(x,j,Math.max(path,map[i][x]));
                if(tmp != -1){
                    ret = Math.min(ret,tmp);
                }
                vis[x] = false;//回溯
            }
        }
        return ret == Long.MAX_VALUE ? -1 : ret;
    }
}

