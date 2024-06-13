package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-13
 * Time: 14:30
 */
import java.util.concurrent.*;
public class demo1 {
    public static void main(String[] args) {
        ExecutorService service1 = Executors.newCachedThreadPool();
        for(int i = 1;i <= 1000;i++){
            int id = i;//这里必须要使用 id 来接受 i
            service1.submit(new Runnable() {//匿名内部类
                @Override
                public void run() {
                    System.out.println(id +" , " + Thread.currentThread().getName());//必须只能打印 id，打印 i 会报错
                    //报错的原因为：变量捕捉
                }
            });
        }

    }
}
