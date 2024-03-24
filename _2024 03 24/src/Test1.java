/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-24
 * Time: 11:38
 */
public class Test1 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }
    public static String minWindow(String s, String t) {
        String ans = "";
        if(t.length() > s.length()){
            return "";
        }
        int[] hash2 = new int[128];//t的
        int len = Integer.MAX_VALUE;
        boolean key = true;
        for(int i = 0;i < t.length();i++){
            hash2[t.charAt(i)]++;
        }
        for(int i = 0;i < s.length() && key == true;i++){
            int count = 0;
            int[] hash1 = new int[128];//s的
            for(int j = i;j < s.length() && s.length() - j >= t.length();j++){
                key = false;
                char in = s.charAt(j);
                hash1[in]++;
                if(hash1[in] <= hash2[in]){
                    count++;
                }
                if(count == t.length()){
                    if(j - i + 1 < len){
                        len = j - i + 1;
                        ans = s.substring(i,j + 1);
                    }
                    key = true;
                    break;
                }
            }
        }
        return ans;
    }
}
