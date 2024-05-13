package demo1;

import org.w3c.dom.css.Counter;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-13
 * Time: 23:30
 */
class A{
    static int count;
    synchronized public static  void add(){
        count++;
    }
    public int getCount(){
        return count;
    }
}

public class demo6 {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        A b = new A();
        Thread t1 = new Thread(() -> {
            for(int i = 0;i < 50000;i++){
                a.add();
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i = 0;i < 50000;i++){
                b.add();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(a.getCount());
    }
}
