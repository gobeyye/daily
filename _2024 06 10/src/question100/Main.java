
package question100;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-10
 * Time: 16:54
 */




import java.util.*;
public class Main {
    static class Pair<K,V>{//不能使用 Java 自带的，会编译不过去
        K v;
        V w;
        public Pair(K v,V w){
            this.v = v;
            this.w = w;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),k = in.nextInt(),m = in.nextInt();
        int INF = 0x3f3f3f3f;
        List<List<Pair<Integer,Integer>>> ret = new ArrayList<>();//使用邻接表的方式存储边
        for(int i = 0;i < n;i++){
            ret.add(new ArrayList<>());
        }
        //1.创建 dp 表
        int[][] dp = new int[n][k + 1];
        for(int i = 0;i < n;i++){
            Arrays.fill(dp[i],INF);
        }
        //2.初始化
        dp[0][0] = 0;
        for(int i = 0;i < m;i++){
            int u = in.nextInt(),v = in.nextInt(),w = in.nextInt();
            ret.get(u).add(new Pair<>(v,w));
            ret.get(v).add(new Pair<>(u,w));//无向图，所以两边都要存储边
        }
        //3.填表
        Queue<Integer> q = new LinkedList<>();//用来存放起点
        q.add(0);
        while(!q.isEmpty()){
            int u = q.poll();
            for(Pair<Integer,Integer> pair:ret.get(u)){//取出边
//                下面是 Dijkstra 算法的思路（不是完全一样）
                int v = pair.v;
                int w = pair.w;
                boolean flag = false;//表示还有没有从 v 节点为起点的必要，
                // 如果为 false 的话说明以 v 为起点绝对不是最小路径，要舍去，同时还可以防止死循环
                if(dp[v][0] > dp[u][0] + w){//选取最优
                    flag = true;
                    dp[v][0] = dp[u][0] + w;
                }

                for(int j = 1;j <= k;j++){
                    if(dp[v][j] > dp[u][j - 1]){
                        flag = true;
                        dp[v][j] = dp[u][j - 1];
                    }
                }
                if(dp[v][k] > dp[u][k] + w){
                    flag = true;
                    dp[v][k] = dp[u][k] + w;
                }
                if(flag == true){
                    q.add(v);
                }
            }
        }
        //4.返回值
//        System.out.println(Math.min(dp[n - 1][0],dp[n - 1][k]));
        System.out.println(dp[n - 1][k]);//都行
    }
}









//import java.util.*;
//import javafx.util.Pair;
//public class Main {
//
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt(),k = in.nextInt(),m = in.nextInt();
//        int INF = 0x3f3f3f3f;
//        List<List<Pair<Integer,Integer>>> ret = new ArrayList<>();
//        for(int i = 0;i < n;i++){
//            ret.add(new ArrayList<>());
//        }
//        //1.创建 dp 表
//        int[][] dp = new int[n][k + 1];
//        for(int i = 0;i < n;i++){
//            Arrays.fill(dp[i],INF);
//        }
//        //2.初始化
//        dp[0][0] = 0;
//        for(int i = 0;i < m;i++){
//            int u = in.nextInt(),v = in.nextInt(),w = in.nextInt();
//            ret.get(u).add(new Pair<>(v,w));
//            ret.get(v).add(new Pair<>(u,w));
//        }
//        //3.填表
//        Queue<Integer> q = new LinkedList<>();
//        q.add(0);
//        while(!q.isEmpty()){
//            int u = q.poll();
//            for(Pair<Integer,Integer> pair:ret.get(u)){
//                int v = pair.getKey();
//                int w = pair.getValue();
//                boolean flag = false;
//                if(dp[v][0] > dp[u][0] + w){
//                    flag = true;
//                    dp[v][0] = dp[u][0] + w;
//                }
//
//                for(int j = 1;j <= k;j++){
//                    if(dp[v][j] > dp[u][j - 1]){
//                        flag = true;
//                        dp[v][j] = dp[u][j - 1];
//                    }
//                }
//                if(dp[v][k] > dp[u][k] + w){
//                    flag = true;
//                    dp[v][k] = dp[u][k] + w;
//                }
//                if(flag == true){
//                    q.add(v);
//                }
//
//            }
//        }
//        //4.返回值
//        System.out.println(Math.min(dp[n - 1][0],dp[n - 1][k]));
//    }
//}
