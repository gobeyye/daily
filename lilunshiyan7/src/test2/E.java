package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-05
 * Time: 23:29
 */
interface Com{
    public void speak();
}
public class E {
    public static void main(String[] args) {
        Com p = ()->{
            System.out.println("p是接口变量");
        };
        p.speak();
    }
}
