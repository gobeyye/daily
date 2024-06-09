package question9;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-09
 * Time: 14:58
 */
//暴力解
//import java.util.*;
//public class Main {
//    static int n;
//    static long ret = 0;
//    static int m;
//    static int[] path;//标记各个项目的人数
//    static int[][] arr;
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        //读入数据
//        n = in.nextInt();m = in.nextInt();
//        path = new int[m + 1];
//        arr = new int[m + 1][2];
//        for(int i = 1;i <= m;i++){
//            arr[i][0] = in.nextInt();
//            arr[i][1] = in.nextInt();
//        }
//        dfs(1);
//        System.out.println(ret);
//    }
//    public static void dfs(int step){
//        if(step > n){
//            long tmp = 0;
//            for(int i = 1;i <= m;i++){
//                tmp += Math.max(0,arr[i][0] * path[i] + arr[i][1]) * path[i];//门票钱要乘于人数才是最终的总价格
//            }
//            //我们最终要求的是总价格
//            ret = Math.max(ret,tmp);
//            return;
//        }
//        dfs(step + 1);//什么都不选的情况
//        for(int i = 1;i <= m;i++){
//            path[i]++;//表示这个人选择第 i 个项目
//            dfs(step + 1);
//            path[i]--;//回溯
//        }
//    }
//}



////贪心 + 优先级队列，正解
//import java.util.*;
//
//public class Main {
//    static class Pair implements Comparable<Pair> {
//        int first, second;
//
//        public Pair(int first, int second) {
//            this.first = first;
//            this.second = second;
//        }
//
//        @Override
//        public int compareTo(Pair o) {
//            return Integer.compare(o.first, this.first);
//        }
//    }
//
//    static int N = 100010;
//    static int n, m;
//    static int[] k = new int[N], b = new int[N], cnt = new int[N];
//    static long ans = 0;
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        n = in.nextInt();
//        m = in.nextInt();
//        PriorityQueue<Pair> pq = new PriorityQueue<>();
//
//        for (int i = 1; i <= m; i++) {
//            k[i] = in.nextInt();
//            b[i] = in.nextInt();
//            cnt[i] = 1;
//            pq.add(new Pair(calc(cnt[i], i), i));
//        }
//
//        while (n-- > 0 && !pq.isEmpty()) {
//            Pair p = pq.poll();
//            int w = p.first, i = p.second;
//            if (w <= 0) break;
//            ans += w;
//            pq.add(new Pair(calc(cnt[i] + 1, i) - calc(cnt[i], i), i));
//            cnt[i]++;
//        }
//        System.out.println(ans);
//    }
//    static int calc(int x, int i) {
//        return x * Math.max(0, k[i] * x + b[i]);
//    }
//}


//自己实现
import javafx.util.*;

import java.util.*;


public class Main{
    static long sum = 0;
    static int[] k;
    static int[] b;
    static int[] cnt;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),m = in.nextInt();
        k = new int[m + 1];
        b = new int[m + 1];
        cnt = new int[m + 1];
        PriorityQueue<Pair<Integer,Integer>> q = new PriorityQueue<>((o1,o2) -> {
            return o1.getKey() > o2.getKey() ? -1 : 1;
        });
        for(int i = 1;i <= m;i++){
            k[i] = in.nextInt();
            b[i] = in.nextInt();
            cnt[i] = 1;
            q.add(new Pair<>(mul(cnt[i],i),i));
        }
        for(int i = 0;i < n;i++){
            Pair<Integer,Integer> tmp = q.poll();
            if(tmp.getKey() <= 0){
                break;
            }
            sum += tmp.getKey();
            Integer t = tmp.getValue();
            q.add(new Pair<>(mul(cnt[t] + 1,t) - mul(cnt[t],t),t));
            cnt[t]++;
        }
        System.out.println(sum);
    }
    public static int mul(int x,int i){
        return (k[i] * x + b[i]) * x;//题目给出的公式
    }
}