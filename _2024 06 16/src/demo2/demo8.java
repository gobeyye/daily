package demo2;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-16
 * Time: 23:30
 */
public class demo8 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ConcurrentHashMap<Integer,String> hash = new ConcurrentHashMap<>();
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int result = 0;
                for(int i = 0;i < 50000;i++){
                    result++;
                }
                return result;
            }
        };
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        Thread t = new Thread(futureTask);
        t.start();
        t.join();
        System.out.println(futureTask.get());
    }
}
