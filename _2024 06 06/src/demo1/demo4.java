package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-06
 * Time: 20:32
 */
public class demo4 {
    static Object locker = new Object();
    static volatile int COUNTER = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i = 0;i < 10;i++){
                synchronized(locker){
                    while(COUNTER % 3 != 0){
                        try {
                            locker.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    COUNTER++;
                    System.out.print(Thread.currentThread().getName());
                    locker.notifyAll();
                }
            }

        },"A");
        Thread t2 = new Thread(() -> {
            for(int i = 0;i < 10;i++){
                synchronized(locker){
                    while(COUNTER % 3 != 1){
                        try {
                            locker.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    COUNTER++;
                    System.out.print(Thread.currentThread().getName());
                    locker.notifyAll();
                }
            }

        },"B");
        Thread t3 = new Thread(() -> {
            for(int i = 0;i < 10;i++){
                synchronized(locker){
                    while(COUNTER % 3 != 2){
                        try {
                            locker.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    COUNTER++;
                    System.out.println(Thread.currentThread().getName());
                    locker.notifyAll();
                }
            }

        },"C");
        t1.start();
        t2.start();
        t3.start();
    }
}
