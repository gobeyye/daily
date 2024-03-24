/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-24
 * Time: 22:19
 */
import java.util.Scanner;
public class question3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] hash = new int[26];
        String s = in.next();
        for(int i = 0;i < s.length();i++){
            hash[s.charAt(i) - 65]++;
        }
        int max = 0;
        for(int i = 0;i < 26;i++){
            max = Math.max(max,hash[i]);
        }
        StringBuilder stb = new StringBuilder();
        for(int i = 0;i < 26;i++){
            if(hash[i] == max){
                char ch = (char)(i + 'A');
                stb.append(ch);
            }
        }
        String ans = stb.toString();
        System.out.println(ans);
    }
}
