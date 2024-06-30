package demo2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-30
 * Time: 9:45
 */
public class Main {
    static int m;

    static int ret;
    static int[][] map;//表示流行砸过的时间
    static boolean[][] vis;//用来去重
    static int[][] ans;//存储对应点的最小时间
    static int[] dx = {0,0,0,1,-1};
    static int[] dy = {0,1,-1,0,0};//原地加上下左右
    static int INF = 310;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        //初始化map，-1表示没有被砸过
        map = new int[INF][INF];
        vis = new boolean[INF][INF];
        ans = new int[INF][INF];
        for(int i = 0;i < INF;i++){
            Arrays.fill(map[i],-1);
        }
        for (int i = 0; i < m; i++) {
            int sx = in.nextInt(),sy = in.nextInt(),st = in.nextInt();
            for(int k = 0;k < 5;k++){
                int x = sx + dx[k];
                int y = sy + dy[k];
                if(x >= 0 && y >= 0 && (map[x][y] == -1 || map[x][y] > st)){
                    map[x][y] = st;//存储最小时间即可
                }
            }
        }
        bfs(0,0);
        System.out.println(ret);
        //一次最好只走一步
    }
    public static void bfs(int i1,int i2){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i1,i2});
        while(!q.isEmpty()){
            int[] tmp = q.poll();
            int a = tmp[0],b = tmp[1];
            vis[a][b] = true;
            if(map[a][b] == -1){
                ret = ans[a][b];
                return;
            }
            for(int k = 1;k <= 4;k++){
                int x = a + dx[k];
                int y = b + dy[k];
                //下面这个必须是要把 -1 的情况特判一下，因为如果 -1 被去除了，那么怎么可能会找到 -1 的点呢。
                if(x >= 0 && y >= 0 && !vis[x][y] && (map[x][y] == -1 || ans[a][b] + 1 < map[x][y])){
//                    ans[x][y]++;//不能这么写，因为 ans 是要根据上一个来推出来的
                    ans[x][y] = ans[a][b] + 1;//不是
                    q.add(new int[]{x,y});
                    vis[x][y] = true;
                }
            }
        }
        ret = -1;
    }
}
