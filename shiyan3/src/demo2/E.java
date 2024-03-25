package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-25
 * Time: 17:06
 */
public class E {
    public static void main(String[] args){
        f(1,2);
        f(-1,-2,-3,-4);
        f(9,7,6);
    }
    public static void f(int x){
        System.out.println(x);
    }
    public static void f(int x1,int x2){
        System.out.println(x1);
        System.out.println(x2);
    }
    public static void f(int x1,int x2,int x3){
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
    public static void f(int x1,int x2,int x3,int x4){
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
    }
}
