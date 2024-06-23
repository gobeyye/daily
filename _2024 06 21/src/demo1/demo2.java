package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-21
 * Time: 20:38
 */
import java.util.concurrent.*;
public class demo2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> callable = new Callable<Integer>() {//菜篮子
            int result = 0;
            @Override
            public Integer call() throws Exception {//菜
                for(int i = 1;i <= 1000;i++){
                    result += i;
                }
                return result;
            }
        };
        FutureTask<Integer> futureTask = new FutureTask<>(callable);//小票
        Thread t1 = new Thread(futureTask);//后厨
        t1.start();//后厨开始工作
        t1.join();
        System.out.println(futureTask.get());//小票取餐
    }
}
