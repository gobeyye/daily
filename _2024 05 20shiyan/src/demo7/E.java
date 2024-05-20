package demo7;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-20
 * Time: 17:27
 */
public class E {
    public static void main(String[] args) {
        String regex = "\\djava\\w{1,}";
        String str1 = "88javaookk";
        String str2 = "9javaHello";
        if(str1.matches(regex)){
            System.out.println(str1);
        }
        if(str2.matches(regex)){
            System.out.println(str2);
        }
    }
}
