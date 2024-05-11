import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    public int lastStoneWeight(int[] stones) {
        //1.创建大根堆
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2)->o2 - o1);
        //2.模拟即可
        int n = stones.length;
        //2.1把数据传入大根堆中
        for(int i = 0;i < n;i++){
            heap.offer(stones[i]);
        }
        while(heap.size() != 0 || heap.size() != 1){//这里经常出错，写完代码后while语句要检查
            int a = heap.poll();
            int b = heap.poll();
            if(a != b){
                heap.offer(Math.abs(a - b));
            }
        }
        if(heap.size() == 0){
            return 0;
        }else{
            return heap.poll();
        }

    }
}