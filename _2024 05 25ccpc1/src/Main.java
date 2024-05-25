import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>((o1,o2) -> {
            return o1 < o2 ? 1 : -1;
        });
        for(int i = 0;i < 5;i++){
            q.add(i);
        }
        q.add(5);
        q.add(5);
        q.remove(1);
        int n = q.size();
        for(int i = 0;i < n;i++){
            System.out.println(q.poll());
        }


    }
}