package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-11
 * Time: 12:26
 */
public class test1 {
    public static void main(String[] args) throws InterruptedException {
        MyTimer myTimer = new MyTimer();
        myTimer.schedule(()->{
            System.out.println("hello 3000");
        },3000);
        myTimer.schedule(()->{
            System.out.println("hello 2000");
        },2000);
        myTimer.schedule(()->{
            System.out.println("hello 1000");
        },1000);
    }
}
