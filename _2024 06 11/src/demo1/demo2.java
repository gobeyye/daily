package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-11
 * Time: 9:02
 */


import java.util.concurrent.*;
public class demo2 {
    //使用 Java 自带的线程池的工厂类
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for(int i = 0;i < 1000;i++){
            int id = i;
            service.submit(new Runnable(){
                @Override
                public void run(){
                    System.out.println("hello " + id + "," + Thread.currentThread().getName());
                }
            });
        }

    }
}
