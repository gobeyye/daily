package question7;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-22
 * Time: 16:02
 */






//暴搜
//import java.util.*;
//public class Main {
//    static int[][] map;
//    static boolean[] vis;
//    static int n,m;
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        n = in.nextInt();m = in.nextInt();
//        map = new int[n + 1][n + 1];
//        //输入路径
//        //矩阵表达式
//        for(int i = 0;i < m;i++){
//            int u = in.nextInt(),v = in.nextInt(),w = in.nextInt();
//            map[u][v] = w;
//            map[v][u] = w;
//        }
//        long max = 0;
//        vis = new boolean[n + 1];
//        for(int i = 1;i <= n;i++){
//            for(int j = i + 1;j <= n;j++){
//                vis[i] = true;
//                long tmp = dfs(i,j,0);//返回从 i 到 j 的最小值
//                if(tmp == -1){
//                    System.out.println(-1);
//                    return;
//                }
//                max = Math.max(max,tmp);
//                vis[i] = false;
//            }
//        }
//        System.out.println(max);
//    }
//    public static long dfs(int i,int j,long path){
//        if(i == j){
//            return path;//出口
//        }
//        long ret = Long.MAX_VALUE;
//        for(int x = 1;x <= n;x++){
//            if(!vis[x]){//必须要在没有找过的地方行动
//                vis[x] = true;
//                ret = Math.min(ret,dfs(x,j,path + map[i][x]));//值就不用回溯了
//                vis[x] = false;//回溯
//            }
//        }
//        return ret == Long.MAX_VALUE ? -1 : ret;
//    }
//}

//正解：最小生成树
import java.util.*;
public class Main{
    static int[] elem;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),m = in.nextInt();
        int[][] edges = new int[m][3];
        elem = new int[n + 1];
        Arrays.fill(elem,-1);
        for(int i = 0;i < m;i++){
            int u = in.nextInt(),v = in.nextInt(),w = in.nextInt();
            edges[i] = new int[]{w,u,v};
        }
//        Arrays.sort(edges,(o1,o2) -> {
////            return o1[0] > o2[0] ? 1 : -1;
//            return o1[0] - o2[0];
//        });
        Arrays.sort(edges, Comparator.comparingInt(a -> a[0]));
        int x = 0;
        for(int i = 0;i < m;i++){
            int w = edges[i][0],u = edges[i][1],v = edges[i][2];
            if(!same(u,v)){
                x++;
                if(x == n - 1){
                    System.out.println(w);
                    return;
                }
                union(u,v);
            }
        }
        System.out.println(-1);
    }
    public static int findRoot(int x){
        while(elem[x] >= 0){/////////////////////////为什么不能！= -1或者 0//因为负数代表是根，负数多少就代表有几个根
            x = elem[x];
        }
        return x;
    }
    public static boolean same(int st,int ed){
        int index1 = findRoot(st);
        int index2 = findRoot(ed);
        if(index1 == index2){
            return true;
        }else{
            return false;
        }
    }
    public static void union(int st,int ed){
        int index1 = findRoot(st);
        int index2 = findRoot(ed);
        if(index1 == index2){
            return;
        }
        elem[index1] += elem[index2];
        elem[index2] = index1;
    }
}


//import java.util.*;
//
//public class Main {
//    static int n, m;
//    static int[] parent, size;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        m = sc.nextInt();
//        parent = new int[n + 1];
//        Arrays.fill(parent,-1);
//
//        // for (int i = 0; i < n; ++i) {
//        //     parent[i] = i;
//        //     size[i] = 1;
//        // }
//
//        int[][] edges = new int[m][3];
//        for (int i = 0; i < m; ++i) {
//            int u = sc.nextInt();
//            int v = sc.nextInt();
//            int w = sc.nextInt();
//            edges[i] = new int[]{w, u, v};
//        }
//        Arrays.sort(edges, Comparator.comparingInt(a -> a[0]));
//
//        int x = 0;
//        for (int i = 0; i < m; ++i) {
//            int w = edges[i][0], u = edges[i][1], v = edges[i][2];
//            if (!same(u, v)) {
//                x++;
//                if (x == n - 1) {
//                    System.out.println(w);
//                    return;
//                }
//                merge(u, v);
//            }
//        }
//        System.out.println(-1);
//    }
//
//    static int find(int x) {
//        if (parent[x] != -1) {
//            x = parent[x];
//        }
//        return x;
//    }
//
//    static boolean same(int x, int y) {
//        return find(x) == find(y);
//    }
//
//    static void merge(int x, int y) {
//        x = find(x);
//        y = find(y);
//        if (x != y) {
//            parent[x] = parent[x] + parent[y];
//            parent[y] = x;
//        }
//    }
//}