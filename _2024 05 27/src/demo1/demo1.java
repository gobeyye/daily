package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-27
 * Time: 13:05
 */




public class demo1 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
        Thread t1 = new Thread(() -> {
            synchronized(lock1){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized(lock2){
                    System.out.println("t1");
                }
            }
            System.out.println("t1.end");
        });
        Thread t2 = new Thread(() -> {
            synchronized(lock2){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized(lock1){
                    System.out.println("t2");
                }
            }
            System.out.println("t2.end");
        });
        t1.start();
        t2.start();


    }
}
