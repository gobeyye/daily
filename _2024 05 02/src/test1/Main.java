package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-02
 * Time: 15:53
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bca";
        CheckPermutation(s1,s2);
    }
    public static boolean CheckPermutation(String s1, String s2) {
        int[] hash = new int[26];
        for(int i = 0;i < s1.length();i++){
            hash[s1.charAt(i) - 'a']++;
        }
        int[] hash2 = new int[26];
        for(int i = 0;i < s2.length();i++){
            hash[s2.charAt(i) - 'a']++;
        }
        for(int i = 0;i < 26;i++){
            if(hash[i] != hash2[i]){
                return false;
            }
        }
        return true;

    }
}
