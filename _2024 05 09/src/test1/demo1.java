package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-09
 * Time: 15:13
 */
public class demo1 {
    public static boolean key = true;
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("hello Thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }

        },"这是我的Thread");
//        t.setDaemon(true);
        t.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t.interrupt();


//        for(int i = 0; i < 5;i++){
//            System.out.println("hello Main");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            t.interrupt();
//        }

    }
}
