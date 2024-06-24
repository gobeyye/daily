package demo1;

import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-23
 * Time: 16:41
 */
public class demo3 {
    //使用线程池计算，基于 Callable 实现 1+2+3+...+1000
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(5);
        class MyCallable implements Callable<Integer>{
            private int start;
            private int end;
            public MyCallable(int start,int end){
                this.start = start;
                this.end = end;
            }
            private int result = 0;
            @Override
            public Integer call() throws Exception {
                for(int i = start;i <= end;i++){
                    result += i;
                }
                return result;
            }
        }
        int count = 10;//把问题拆分成 10 个
        Future<Integer>[] futures = new Future[count];
        for(int i = 0;i < count;i++){
            int st = (100 * i) + 1;
            int ed = (100 * (i + 1));
            futures[i] = service.submit(new MyCallable(st,ed));
        }
        int sum = 0;
        for(int i = 0;i < count;i++){
            sum += futures[i].get();
        }
        System.out.println(sum);
    }
}
