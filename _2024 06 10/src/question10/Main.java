package question10;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-10
 * Time: 15:27
 */


//思路错误了，这是最小生成树的写法

//import java.util.*;
//public class Main {
//    //没有使用魔法阵的情况下
//    static int[] elems;
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        //不用真的建出来一个图
//        int n = in.nextInt(),k = in.nextInt(),m = in.nextInt();
//        elems = new int[n];
//        Arrays.fill(elems,-1);
//        Integer[][] edges = new Integer[m][3];
//        for(int i = 0;i < m;i++){
//            edges[i][0] = in.nextInt();edges[i][1] = in.nextInt();
//            edges[i][2] = in.nextInt();
//        }//排序
//        Arrays.sort(edges,(o1,o2) -> {
//            return o1[2] > o2[2] ? -1 : 1;
//        });
//        long ret = 0;//存储最终的答案
//        for(int i = 0;i < m;i++){
//            if(!same(edges[i][0],edges[i][1])){//说明不会构成环
//                union(edges[i][0],edges[i][1]);
//                ret += edges[i][2];
//            }
//        }
//        System.out.println(ret);
//    }
//    public static boolean same(int x,int y){
//        int index1 = find(x);
//        int index2 = find(y);
//        return index1 == index2;
//    }
//
//    public static void union(int x,int y){
//        int index1 = find(x);
//        int index2 = find(y);
//        if(index1 == index2){
//            return;
//        }
//        if(Math.abs(elems[index1]) < Math.abs(elems[index2])){//保证 index1 是最大的，加快查找，优化
//            int tmp = elems[index2];
//            elems[index2] = elems[index1];
//            elems[index1] = tmp;
//        }
//        elems[index1] += elems[index2];
//        elems[index2] = index1;
//    }
//    public static int find(int x){
//        while(elems[x] >= 0){
//            x = elems[x];
//        }
//        return x;
//    }
//}





//正解
import java.util.*;

public class Main {
    static final int N = 1010;
    static final int INF = 1000000000;
    static int n, m, k;
    static ArrayList<ArrayList<Pair>> g = new ArrayList<>();
    static int[][] d = new int[N][N];

    static class Pair {
        int first, second;
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static void dijkstra() {
        for (int i = 0; i < n; ++i)
            Arrays.fill(d[i], INF);

        d[0][0] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while (!q.isEmpty()) {
            int x = q.poll();

            for (Pair p : g.get(x)) {
                int y = p.first, w = p.second;
                boolean flag = false;
                if (d[y][0] > d[x][0] + w) {
                    d[y][0] = d[x][0] + w;
                    flag = true;
                }

                for (int j = 1; j <= k; ++j) {
                    if (d[y][j] > d[x][j - 1]) {
                        d[y][j] = d[x][j - 1];
                        flag = true;
                    }
                }

                if (d[y][k] > d[x][k] + w) {
                    flag = true;
                    d[y][k] = d[x][k] + w;
                }

                if (flag)
                    q.add(y);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        m = in.nextInt();

        for (int i = 0; i < n; ++i)
            g.add(new ArrayList<>());

        for (int i = 0; i < m; ++i) {
            int u = in.nextInt();
            int v = in.nextInt();
            int w = in.nextInt();
            g.get(u).add(new Pair(v, w));
            g.get(v).add(new Pair(u, w));
        }

        dijkstra();

        System.out.println(Math.min(d[n - 1][0], d[n - 1][k]));
    }
}