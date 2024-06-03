package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-03
 * Time: 8:13
 */
public class Test {
    private int i = f();
    private int j = 10;
    private int f(){
        return j;
    }

    public static void main(String[] args) {
        System.out.println(new Test().i);
    }
}
