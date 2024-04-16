package test4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-16
 * Time: 23:11
 */
class A{
    int m;
    int getM(){
        return m;
    }
    int seeM(){
        return m;
    }
}
class B extends A{
    int m;
    int getM(){
        return m + 100;
    }
}
public class E {
    public static void main(String[] args) {
        B b = new B();
        b.m = 20;
        System.out.println(b.getM());
        A a = b;
        a.m = -100;
        System.out.println(a.getM());
        System.out.println(a.seeM());
    }
}
