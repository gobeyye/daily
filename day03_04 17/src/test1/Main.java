package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-16
 * Time: 19:40
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder ans = new StringBuilder();
        s = s.toUpperCase();
        ans.append(s.charAt(0));
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == ' '){
                ans.append(s.charAt(i + 1));
            }
        }
        System.out.println(ans);
    }
}
