package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-10
 * Time: 9:49
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class demo2 {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.run();
    }
    public static void main1(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
//        int id = 0;
        for(int i = 0;i < 1;i++){
            int id = i;
            service.submit(new Runnable(){
                @Override
                public void run() {
                    System.out.println("hello" + id + Thread.currentThread().getName());
                }
//                @Override
//                public void run(){
//
//                }
            });
        }


    }
}
class Student{
    int id;
    String name;
    public void run(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("hello");
    }
}

