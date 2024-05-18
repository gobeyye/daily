package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-18
 * Time: 17:13
 */
public class demo3 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while(Thread.currentThread().isInterrupted()){
                System.out.println("hello Thrad");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }
}
