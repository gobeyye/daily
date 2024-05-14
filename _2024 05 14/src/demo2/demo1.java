package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-14
 * Time: 15:59
 */
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("hello Thread");
    }
}
public class demo1 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
}
