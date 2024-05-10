package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-10
 * Time: 16:21
 */
class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("hello Thread");
        System.out.println("Thread end");
    }
}
public class demo2 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
