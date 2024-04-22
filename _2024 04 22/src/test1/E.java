package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-22
 * Time: 17:12
 */
interface A{
    double f(double x,double y);
}
class B implements A{
    public double f(double x,double y){
        return x * y;
    }
    int g(int a,int b){
        return a + b;
    }
}
public class E {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.f(3,5));
        B b = (B)a;
        System.out.println(b.g(3,5));
    }
}
