package boke;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-03
 * Time: 23:12
 */
public class demo3 {
    public volatile static int count = 0;
    public static void main(String[] args) {
        Object locker = new Object();
        Thread t1 = new Thread(() -> {
            for(int i = 0;i < 50000;i++){
//                synchronized(locker){
                    count++;
//                }

            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0;i < 50000;i++){
//                synchronized(locker){
                    count++;
//                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count);
    }
}
