package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-20
 * Time: 21:29
 */
public class Test1 {
    public static void func(StringBuilder s){
        s.append('d');
        s.append('e');
    }
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("");
        s.append((char)('c' - 1));
        String a = s.toString();
        System.out.println(s);
        String ss = new String("123");
        String s1 = new String(ss);
        System.out.println(s1);
    }
}
