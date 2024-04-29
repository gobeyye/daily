import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int[] hash = new int[26];
        char maxChar = '0';
        int maxCount = 0;
        for(int i = 0;i < n;i++){
            if(maxCount < ++hash[s.charAt(i) - 'a']){
                maxChar = s.charAt(i);
                maxCount = hash[s.charAt(i) - 'a'];
            }
        }
        if(maxCount > (n + 1) / 2){
            System.out.println("no");
            return;
        }
        char[] ans = new char[n];
        int i = 0;
        System.out.println(maxCount);
        while(maxCount-- != 0){
            ans[i] = (maxChar);
            i += 2;
        }
        for(int j = 0;j < 26;j++){
            if(hash[j] != 0 && s.charAt(j) != maxChar){
                while(hash[j]-- != 0){
                    if(i >= n){
                        i = 1;
                    }
                    ans[i] = (char)(j + 'a');
                    i += 2;
                }
            }
        }
        String ssss = new String(ans);
        System.out.println("yes");
        System.out.println(ssss);
    }
}