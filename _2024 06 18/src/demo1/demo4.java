package demo1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-18
 * Time: 21:15
 */
public class demo4 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> callable = new Callable<Integer>() {
            int sum = 0;
            @Override
            public Integer call() throws Exception {
                for(int i = 0;i < 10000000000L;i++){
                    sum++;
//                    Thread.sleep(1000);
                }
                return sum;
            }
        };
        FutureTask<Integer> task = new FutureTask<>(callable);
        Thread t1 = new Thread(task);
        t1.start();
        System.out.println(task.get());
    }
}
