package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-13
 * Time: 17:06
 */
public class demo4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 1000_0000; i++) {

            }
        }, "李四");
        System.out.println(t.getName() + ": " + t.getState());;
        t.start();
        while (t.isAlive()) {
            System.out.println(t.getName() + ": " + t.getState());;
        }
        System.out.println(t.getName() + ": " + t.getState());;
    }
}


