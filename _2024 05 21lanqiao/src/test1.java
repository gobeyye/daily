/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-21
 * Time: 12:26
 */
class A{
    int a;
    static int b;
}
public class test1 {
    public static void main(String[] args) {
        A h1 = new A();
        A h2 = new A();
        h1.a = 3;
        h1.b = 3;
        h2.a = 5;
        h2.b = 5;
        System.out.println("h1.a:"+h1.a + "   " + "h1.b:" +  h1.b);
    }
    //快速幂

}
