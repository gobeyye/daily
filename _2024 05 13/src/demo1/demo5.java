package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-13
 * Time: 17:23
 */
public class demo5 {
    static int count = 0;
    public static void main(String[] args) throws InterruptedException {
        Object locker1 = new Object();
        Object locker2 = new Object();
        Thread t1 = new Thread(() -> {
            synchronized(locker2){
                for(int i = 0;i < 50000;i++){
//                synchronized(locker1){
//                    count++;
//                }
                count++;

                }

            }

        },"t1");
        Thread t2 = new Thread(() -> {
            synchronized(locker1){
                for(int i = 0;i < 50000;i++){
//                synchronized(locker1) {
//                    count++;
//                }
                    count++;
                }
            }

        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();//main线程等待t1和t2
        System.out.println(count);
    }
}
