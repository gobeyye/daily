/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-16
 * Time: 16:34
 */

public class test1 {
    public static void main(String[] args) {
        char[] ch = {'a','b'};
        String ans = ch.toString();
        System.out.println(ans);
    }
    public static void main2(String[] args) {
        StringBuilder sd = new StringBuilder("ab");
        String ans = sd.toString();
        System.out.println(ans);
    }
    public String convert(String ss, int numRows) {
        StringBuilder[] sds = new StringBuilder[numRows];
        char[] s = ss.toCharArray();
        int n = s.length;
        for(int i = 0;i < numRows;i++){
            sds[i] = new StringBuilder();
        }
        for(int i = 0;i < n;){
            for(int j = 0;j <= numRows - 1;j++){
                sds[j].append(s[i++]);
                if(i >= n){
                    break;
                }
            }
            if(i >= n){
                break;
            }
            for(int j = numRows - 2;j >= 1;j--){
                sds[j].append(s[i++]);
                if(i >= n){
                    break;
                }
            }
        }
        String ans = new String();
        for(int i = 0;i < numRows;i++){
            ans += new String(sds[i]);
        }
        return ans;
    }
}
