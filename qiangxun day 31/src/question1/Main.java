package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-19
 * Time: 21:36
 */
import java.util.*;


// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i = 0;i < n;i++){
            heap.add(in.nextInt());
        }
        int ret = 0;//记录答案
        while(k >= 0){
            ret++;
            int sub = heap.poll();
            k -= sub;
            heap.add(sub * 2);
        }
        System.out.println(ret - 1);
    }
}
