package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-16
 * Time: 23:04
 */
class A{
    public int getNumber(int a){
        return a + 1;
    }
}
class B extends A{
    public int getNumber(int a){
        return a + 100;
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.getNumber(10));
        a = new B();
        System.out.println(a.getNumber(10));
    }
}