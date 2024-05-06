package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-06
 * Time: 8:46
 */
public class test2 {
    public static String longestPalindrome(String s) {
        int ansLeft = 0;
        int maxLen = 0;
        int n = s.length();
        for(int i = 0;i < s.length();i++){
            int left = i - 1;
            int right = i + 1;
            while(left >= 0 && right <= n - 1 && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }
            if(left >= 0 && right <= n -1 && right - left + 1 > maxLen){
                maxLen = right - left - 1;
                ansLeft = left + 1;
            }
        }
        return s.substring(ansLeft,maxLen + ansLeft);
    }
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
