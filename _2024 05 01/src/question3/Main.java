package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-01
 * Time: 20:03
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] s = in.next().toCharArray();
        int n = s.length;
        int len = in.nextInt();
        int minCount = Integer.MAX_VALUE;
        int ansLeft = 0;
        int ansRight = 0;
        int countGC = 0;
        int left = 0,right = 0;
        int k = 0;
        for(;k < len;k++){
            if(s[k] == 'G' || s[k] == 'C'){
                countGC++;
            }
        }
        minCount = countGC;
        ansLeft = 0;
        ansRight = len - 1;
        right = k;
        left++;
        while(right < n){
            if(s[right] == 'C' || s[right] == 'G'){
                countGC++;
            }
            if(s[left - 1] == 'C' || s[left - 1] == 'G'){
                countGC--;
            }
            if(countGC > minCount){
                minCount = countGC;
                ansRight = right;
                ansLeft = left;
            }
            right++;
            left++;
        }
        String ans1 = new String(s);
        String ans2 = ans1.substring(ansLeft,ansRight + 1);
        System.out.println(ans2);
    }
}
