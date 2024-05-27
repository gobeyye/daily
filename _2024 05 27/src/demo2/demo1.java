package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-27
 * Time: 19:18
 */
public class demo1 {
    public static void main(String[] args) {
        Object lock = new Object();
        Thread t = new Thread(() -> {
            synchronized(lock){
                synchronized(lock){
                    System.out.println("hello t");
                }
            }
            System.out.println("t.end");
        });
        t.start();
    }
}
