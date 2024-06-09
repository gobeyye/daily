package test;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-09
 * Time: 20:52
 */
//自己实现
//import javafx.util.*;

import java.util.*;


public class Main{
    static long sum = 0;//最初最终的总和
    static int[] k;
    static int[] b;
    static int[] cnt;//记录对应项目的人数
    static class Pair{//不能使用Java自带的，会遍历错误，很奇怪
        int key;//表示可以直接加到总和的花费
        int val;//表示第 val 个项目
        public Pair(int key,int val){
            this.key = key;
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),m = in.nextInt();
        k = new int[m + 1];
        b = new int[m + 1];
        cnt = new int[m + 1];
        //大根堆
        PriorityQueue<Pair> q = new PriorityQueue<>((o1,o2) -> {
            return o1.key > o2.key ? -1 : 1;
        });
        //读入数据
        for(int i = 1;i <= m;i++){
            k[i] = in.nextInt();
            b[i] = in.nextInt();
            cnt[i] = 1;
            q.add(new Pair(mul(cnt[i],i),i));
        }
        for(int i = 0;i < n;i++){
            Pair tmp = q.poll();
            if(tmp.key <= 0){//小于0说明后续都小于0，直接退出即可
                break;
            }
            sum += tmp.key;
            Integer t = tmp.val;
            q.add(new Pair((k[t] * (2 * cnt[t] + 1) + b[t]),t));//推导出来的公式。
            cnt[t]++;//对应的人数 + 1
        }
        System.out.println(sum);
    }
    public static int mul(int x,int i){
        return (k[i] * x + b[i]) * x;//题目给出的公式
    }
}
