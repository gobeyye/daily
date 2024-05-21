package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-21
 * Time: 8:14
 */
public class Main {
    public static void main(String[] args) {
        String s = "abc";
        change(s);
        System.out.println(s);
    }
    public static void change(String s){
        s = s + "def";
    }
}
