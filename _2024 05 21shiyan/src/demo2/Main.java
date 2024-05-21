package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-21
 * Time: 15:16
 */
public class Main {
    public static void main(String[] args) {
        String str = "ab123you你是谁?";
        String regex = "\\D+";
        str = str.replaceAll(regex,"");
        System.out.println(str);
    }
}
