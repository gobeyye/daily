package boke;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-04
 * Time: 10:59
 */
public class demo1 {
    public static void main(String[] args) {
        Object locker = new Object();
        Thread t1 = new Thread(() -> {
            System.out.println("开始");
            try {
//                synchronized(locker){
                    locker.wait();
//                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("结束");

        });
        t1.start();
    }
}
