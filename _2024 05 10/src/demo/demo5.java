package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-10
 * Time: 16:48
 */
public class demo5 {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            System.out.println("hello Thread");
            System.out.println("Thread end");
        });
        t.start();
    }
}
