package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-17
 * Time: 20:36
 */
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
public class demo3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        编写代码, 基于 Callable 实现 1+2+3+...+1000
        //餐盘
        Callable<Integer> callable = new Callable<Integer>(){
            int result = 0;
            @Override
            public Integer call(){
                for(int i = 1; i <= 1000;i++){
                    result += i;
                }
                return result;
            }
        };
        //小票
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        //交给后厨
        Thread t = new Thread(futureTask);
        t.start();
        t.join();
        System.out.println(futureTask.get());
    }
}
