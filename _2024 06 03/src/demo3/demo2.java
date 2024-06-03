package demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-03
 * Time: 17:09
 */
public class demo2 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        Thread t2 = new Thread(() -> {
            System.out.println("t2 start");
            synchronized(object){
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("t2 end");
        });
        Thread t1 = new Thread(() -> {
            t2.interrupt();
        });
        t2.start();

        Thread.sleep(1000);
        t1.start();
    }
}
