package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-22
 * Time: 17:15
 */
interface Com{
    int add(int a,int b);
}
abstract class A{
    abstract int add(int a,int b);
}
class B extends A implements Com{
    public int add(int a,int b){
        return a + b;
    }
}
public class E {
    public static void main(String[] args) {
        B b = new B();
        Com com = b;
        System.out.println(com.add(12,6));
        A a = b;
        System.out.println(a.add(10,5));
    }
}
