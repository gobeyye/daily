package demo1;

import java.util.Hashtable;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-22
 * Time: 16:47
 */
public class demo1 {

    public static void main(String[] args) {
        Hashtable<Integer,Integer> hash = new Hashtable<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        //翻译都是有偏差的
//        Stream<Integer> stream = new Stream<>();
        ExecutorService service = Executors.newFixedThreadPool(5);
        int a = 3;
    }
}
