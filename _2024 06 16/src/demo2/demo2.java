package demo2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-16
 * Time: 22:27
 */
public class demo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new Callable<Integer>() {
            int result = 0;
            @Override
            public Integer call() throws Exception {
                for(int i = 0;i < 50000;i++){
                    result++;
                }
                return result;
            }
        };
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callable);
        Thread t = new Thread(futureTask);
        t.start();
        t.join();
        System.out.println(futureTask.get());
    }
}
