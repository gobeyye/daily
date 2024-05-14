package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-14
 * Time: 16:02
 */
public class demo2 {
    static int a;
    public static void main(String[] args) {
        Thread[] t = new Thread[20];
        a = 0;
        for(int i = 0;i < 20;i++){
            t[i] = new Thread(() -> {
                System.out.println(a++);
            });
        }
        for(int i = 0;i < 20;i++){
            t[i].start();
        }
        for(int i = 0;i < 20;i++){
            try {
                t[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("ok");
    }
}
