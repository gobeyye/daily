package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-09
 * Time: 19:43
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        int count = 0;
        if(a.length() == b.length()){
            int n = a.length();
            for(int i = 0;i < n;i++){
                if(a.charAt(i) == b.charAt(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
        System.out.println(1);

    }
}
