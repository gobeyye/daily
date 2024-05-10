package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-10
 * Time: 19:31
 */
public class demo6 {
    public static void main(String[] args) {
        Thread t = new Thread(()->{
            while(true){
                System.out.println("hello Thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"我的Thread");
        t.start();
        while(true){
            System.out.println("hello Main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
