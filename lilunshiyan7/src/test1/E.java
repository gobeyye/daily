package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-05
 * Time: 23:26
 */
class Cry{
    public void cry(){
        System.out.println("大家好");
    }
}
public class E {
    public static void main(String[] args) {
        Cry hello = new Cry(){
            public void cry(){
                System.out.println("大家好,祝工作顺利!");
            }
        };
        hello.cry();
    }
}
