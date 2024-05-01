package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-01
 * Time: 20:02
 */
public class Main {
    public String formatString (String str, char[] arg) {
        // write code here
        StringBuilder sd = new StringBuilder();
        char[] s = str.toCharArray();
        int k = 0;
        for(int i = 0;i < s.length;){
            if(s[i] != '%'){
                sd.append(s[i]);
                i++;
            }else{
                sd.append(arg[k++]);
                i += 2;
            }
        }
        for(int i = k;i < arg.length;i++){
            sd.append(arg[i]);
        }
        String ans = sd.toString();
        return ans;
    }
}
