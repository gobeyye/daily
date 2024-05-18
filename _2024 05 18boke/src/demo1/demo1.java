package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-18
 * Time: 16:06
 */
public class demo1 {
    static boolean isRunning = true;
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while(isRunning){
                System.out.println("李四正在转账");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("还好及时停了下来");
        },"李四");
        System.out.println("让李四开始转账");
        t.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("老板来电话了，说对方是骗子，快停下来");
        isRunning = false;
    }
}
