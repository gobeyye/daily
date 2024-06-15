package demo4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-15
 * Time: 19:55
 */
public class test2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("aaa");
            System.out.println("bbb");
            System.out.println("ccc");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("gggg");
            System.out.println("kkkk");
            System.out.println("oooo");
        });
        t1.start();
        t2.start();
    }
}
