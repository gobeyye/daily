package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-13
 * Time: 16:47
 */
public class demo1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while(true){
                System.out.println("hello Thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        },"aaaa");
        Thread t2 = new Thread(() -> {
            try {
                t1.join(1000 * 24 * 60);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while(true){
                System.out.println("hello Thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"bbb");
//        System.out.println(t1.getState());
        t1.start();
        Thread.sleep(1000);
//        System.out.println(t1.getState());
        t2.start();
        Thread.sleep(1000);
//        System.out.println(t2.getState());
        System.out.println(t1.isAlive());


    }
}
