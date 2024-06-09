package MyBolckingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-07
 * Time: 21:41
 */
public class test {
    public static void main(String[] args) {
        MyBlockingQueue q = new MyBlockingQueue(1000);
        Thread t1 = new Thread(() -> {
            int count = 1;
            while (true) {
                try {
//                    Thread.sleep(1000);
                    System.out.println("生产: " + count);
                    q.put("" + count);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                count++;
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(1000);
                    String tmp = q.take();
                    System.out.println("消耗: " + tmp);
                }
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
    }
}
