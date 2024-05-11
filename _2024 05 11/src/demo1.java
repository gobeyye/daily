/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-11
 * Time: 21:33
 */
interface Com{
    int add(int a,int b);
}
abstract class A{
    abstract int add(int a,int b);
}
class B extends A implements Com{
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
public class demo1 {
    public static void main(String[] args) {
        B b=  new B();
        Com com = b;
        System.out.println(com.add(12,6));
        A a = b;
        System.out.println(a.add(10,5));
    }
}
