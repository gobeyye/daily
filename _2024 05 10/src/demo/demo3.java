package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-10
 * Time: 16:37
 */
public class demo3 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println("hello Thread");
                System.out.println("Thread end");
            }
        };
        t.start();
    }
}
