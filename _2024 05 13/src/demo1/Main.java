package demo1;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-13
 * Time: 16:34
 */
public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while(true){
                System.out.println("hello Thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(() -> {
            System.out.println("hello Thread");
        });
        System.out.println(t2.getState());
        t2.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t2.getState());
    }
}
