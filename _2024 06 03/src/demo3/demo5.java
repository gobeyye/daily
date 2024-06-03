package demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-03
 * Time: 20:15
 */
public class demo5 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        },"a");
        t.start();
    }
}
