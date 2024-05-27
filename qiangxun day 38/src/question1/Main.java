package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-27
 * Time: 21:44
 */





import java.util.*;
// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        int q = in.nextInt();
        //1.创建小根堆。
        PriorityQueue<Integer> heap = new PriorityQueue<>();//小根堆
        //2.预处理
        int[] prev = new int[n];
        for(int i = 0;i < n;i++){
            if(heap.size() < 2 ){
                heap.add(nums[i]);
            }else{
                if(heap.peek() < nums[i]){
                    heap.poll();
                    heap.add(nums[i]);
                }
            }
            if(heap.size() == 2){
                prev[i] = heap.peek();
            }
        }
        //3.模拟，得出答案
        while(q > 0){
            int x = in.nextInt() - 1;
            System.out.println(prev[x]);
            q--;
        }
    }
}
