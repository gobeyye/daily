package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-16
 * Time: 10:38
 */
public class demo4 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("hello Thread 0");
        });
        t.run();//只是执行这个方法，通过 main 线程调用 run 方法
        System.out.println("aaaa");

    }
}
