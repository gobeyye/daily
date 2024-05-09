package demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-09
 * Time: 14:54
 */
//3.继承Thread重写run，使用匿名内部类
public class Main{
    public static void main(String[] args) {
        //匿名内部类不是lambada表达式
        Thread t = new Thread(){
            @Override
            public void run() {
                while(true){
                    System.out.println("hello Thread");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }


            }
        };
        t.start();
        while(true){
            System.out.println("hello Main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
