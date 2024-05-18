package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-18
 * Time: 18:42
 */
public class demo4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for(int i = 0;i < 3;i++){
                System.out.println("我是李四");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("t end");
        },"李四");
        t.start();
        t.join();
        System.out.println("Main end");

    }
}
