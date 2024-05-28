package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-28
 * Time: 20:11
 */


import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            //1.统计各个字母出现次数
            char[] s = in.next().toCharArray();
            int ret = 0;
            int n = s.length;
            int[] hash = new int[300];
            for(int i = 0;i < n;i++){
                hash[s[i]]++;
            }
            //2.存入小根堆每次取两个，相加放回去
            PriorityQueue<Integer> heap = new PriorityQueue<>();
            for(int i = 0;i < 300;i++){
                if(hash[i] != 0){
                    heap.add(hash[i]);
                }
            }
            while(heap.size() > 1){
                int a = heap.poll(),b = heap.poll();
                ret += a + b;
                heap.add(a + b);
            }
            //3.ret++
            System.out.println(ret);

        }

    }
}
