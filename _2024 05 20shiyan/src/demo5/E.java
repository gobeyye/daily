package demo5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-20
 * Time: 17:22
 */
public class E {
    public static void main(String[] args) {
        byte d[] = "abc 我们喜欢篮球".getBytes();
        System.out.println(d.length);
        String s = new String(d,0,7);
        System.out.println(s);
    }
}
