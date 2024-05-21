package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-21
 * Time: 21:01
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //滑动窗口
        int[] hash = new int[26];
        char[] s = in.next().toCharArray();
        int n = s.length;
        int max = 1;
        int left = 0,right = 0;
        int count = 0;
        while(right < n){
            //进窗口
            if(hash[s[right] - 'a'] == 0){
                count++;//一种字符
            }
            hash[s[right] - 'a']++;
            while(count > 2){//出窗口
                hash[s[left]-'a']--;
                if(hash[s[left] - 'a'] == 0){//一种字符已经消失
                    count--;//对应的个数要 --
                }
                left++;//对应left要 ++
            }
            max = Math.max(max,right - left + 1);
            right++;//right ++
        }
        System.out.println(max);
    }
}