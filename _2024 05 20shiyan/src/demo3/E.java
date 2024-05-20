package demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-20
 * Time: 17:11
 */
public class E {
    public static void main(String[] args) {
        String str = new String("苹果");
        moidfy(str);
        System.out.println(str);
    }
    public static void moidfy(String s){
        s = s + "好吃";
    }
}
