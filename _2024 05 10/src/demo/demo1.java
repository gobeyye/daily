package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-10
 * Time: 16:11
 */
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("hello Thread");
        System.out.println("Thread end");
    }
}
public class demo1 {
    public static void main(String[] args) {
        Thread t = new MyThread();//向上转型
        t.start();//启动线程
    }
}
