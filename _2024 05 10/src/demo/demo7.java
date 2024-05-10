package demo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-10
 * Time: 20:05
 */
public class demo7 {
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
        });
//        t.setDaemon(true);//把t设置为后台线程
        t.start();//启动线程
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main end");
    }
}
