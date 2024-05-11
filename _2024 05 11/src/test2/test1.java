package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-11
 * Time: 21:12
 */
class A{
    int m = 1;
    int add(){
        return m + 1;
    }
}
class B extends A{
    double m = 6.0;
    double decrease(){
        return m - 1;
    }
}
public class test1 {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.m);
    }
}