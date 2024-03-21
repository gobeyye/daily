import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-21
 * Time: 21:44
 */
public class Test3 {
    public static void main(String[] args) {
        char[] ch = new char[]{'a','b','c'};
        String s1 = new String(ch);
        s1.intern();
        String s2 = "abc";
        System.out.println(s1 == s2);
    }
    public static void main1(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");


    }
}
