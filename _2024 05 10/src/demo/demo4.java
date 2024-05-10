package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-10
 * Time: 16:47
 */
public class demo4 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println("hello Thread");
                System.out.println("Thread end");
            }
        });
        t.start();
    }
}
