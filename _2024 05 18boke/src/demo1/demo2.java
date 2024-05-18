package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-18
 * Time: 16:32
 */
public class demo2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("李四正在转账");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("还好及时停了下来");
        },"李四");
        System.out.println("让李四开始转账");
        t.start();
        Thread.sleep(1000);
        System.out.println("老板来电话了，说对方是骗子，快停下来");
        t.interrupt();//进行终止
    }
}
