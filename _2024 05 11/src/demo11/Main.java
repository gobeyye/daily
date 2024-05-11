package demo11;

import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-11
 * Time: 23:31
 */
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(3);
        heap.offer(5);
        heap.offer(7);
        heap.offer(10);
        heap.offer(6);
        heap.poll();
        System.out.println(heap.size());
        System.out.println(heap.peek());

    }
}
