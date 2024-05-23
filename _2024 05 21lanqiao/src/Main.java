/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */

















////正解：最小生成树
//import java.util.*;
//public class Main{
//    static int[] elem;
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt(),m = in.nextInt();
//        int[][] edges = new int[m][3];
//        elem = new int[n];
//        Arrays.fill(elem,-1);
//        for(int i = 0;i < m;i++){
//            int u = in.nextInt() - 1,v = in.nextInt() - 1,w = in.nextInt();
//            edges[i] = new int[]{w,u,v};
//        }
////        Arrays.sort(edges,(o1,o2) -> {
//////            return o1[0] > o2[0] ? 1 : -1;
////            return o1[0] - o2[0];
////        });
//        Arrays.sort(edges, Comparator.comparingInt(a -> a[0]));
//        int x = 0;
//        for(int i = 0;i < m;i++){
//            int w = edges[i][0],u = edges[i][1],v = edges[i][2];
//            if(!same(u,v)){
//                x++;
//                if(x == n - 1){
//                    System.out.println(w);
//                    return;
//                }
//                union(u,v);
//            }
//        }
//        System.out.println(-1);
//    }
//    public static int findRoot(int x){
//        while(elem[x] >= 0){/////////////////////////为什么不能！= -1或者 0//因为负数代表是根，负数多少就代表有几个根
//            x = elem[x];
//        }
//        return x;
//    }
//    public static boolean same(int st,int ed){
//        int index1 = findRoot(st);
//        int index2 = findRoot(ed);
//        if(index1 == index2){
//            return true;
//        }else{
//            return false;
//        }
//    }
//    public static void union(int st,int ed){
//        int index1 = findRoot(st);
//        int index2 = findRoot(ed);
//        if(index1 == index2){
//            return;
//        }
//        elem[index1] += elem[index2];
//        elem[index2] = index1;
//    }
//}




import java.util.*;

public class Main {
    static int n, m;
    static int[] elem;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        elem = new int[n];
        Arrays.fill(elem,-1);
        int[][] edges = new int[m][3];
        for (int i = 0; i < m; ++i) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            int w = sc.nextInt();
            edges[i] = new int[]{w, u, v};
        }
        Arrays.sort(edges, Comparator.comparingInt(a -> a[0]));
        int x = 0;
        for (int i = 0; i < m; ++i) {
            int w = edges[i][0], u = edges[i][1], v = edges[i][2];
            if (!same(u, v)) {
                x++;
                if (x == n - 1) {
                    System.out.println(w);
                    return;
                }
                union(u, v);
            }
        }
        System.out.println(-1);
    }

    static int find(int x) {
        while (elem[x] >= 0) {
            x = elem[x];
        }
        return x;
    }

    static boolean same(int x, int y) {
        return find(x) == find(y);
    }

    public static void union(int x1, int x2) {
        x1 = find(x1);
        x2 = find(x2);
        if (x1 != x2) {
            //这一步可以说是小优化，每次都把值放在较大的里面，能有效减少查找次数，减小超时的几率
            //不太理解的可以画个图帮助理解一下。
            if(elem[x1] < elem[x2]){//没有这一步会超时
                int tmp = x2;
                x2 = x1;
                x1 = tmp;
            }
            elem[x2] = elem[x2] + elem[x1];
            elem[x1] = x2;
        }
    }
}
