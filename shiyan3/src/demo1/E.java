package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-25
 * Time: 17:03
 */
class A{
    double f(int x,double y) {
        return x + y;
    }
    int f(int x,int y){
        return x * y;
    }
}
public class E {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.f(10,10));
        System.out.println(a.f(10,10.0));
    }
}
