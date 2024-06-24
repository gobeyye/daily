package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-24
 * Time: 14:08
 */
import java.util.*;
public class Main{
    static int n,m;
    static int ss;
    static int INF;
    static int[][] a;
    static boolean[] vis;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();m = in.nextInt();
        a = new int[m][n];//题目数据
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                a[i][j] = in.nextInt();
            }
        }
        INF = (1 << n);//表示所有二进制的位数
        vis = new boolean[INF];//去重
        ss = INF - 1;//表示 0 到 n - 1 二进制位置上全为 1.
        int ans = bfs();// 利用 bfs 求最短路
        System.out.println(ans);
    }
    public static int bfs(){
        Queue<Integer> q = new LinkedList<>();
        int step = 0;
        q.add(ss);
        int tmp1 = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int k = 0;k < size;k++){
                int tmp = q.poll();
                if(tmp == 0) return step;
                for(int i = 0;i < m;i++){//枚举按钮
                    tmp1 = tmp;//创建临时。
                    for(int j = 0;j < n;j++){//枚举灯泡
                        if(a[i][j] == 1 && (tmp1 & (1 << j)) != 0){//a 为 1 表示要关灯
                            tmp1 ^= (1 << j);
                        }
                        if(a[i][j] == -1 && (tmp1 & (1 << j)) == 0){//a 为 1 表示要开灯
                            tmp1 ^= (1 << j);
                        }
                    }
                    if(!vis[tmp1]){//去重，一个开关可以一直关开，越早标记肯定路径越短
                        q.add(tmp1);
                        vis[tmp1] = true;
                    }
                }

            }
            step++;
        }
        return -1;//没有找到
    }
}
