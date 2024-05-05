package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-05
 * Time: 21:39
 */
import java.util.*;


public class Main {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param param string字符串
     * @return string字符串
     */
    public String compressString (String ss) {
        // write code here
        ss = ss.toLowerCase();
        char[] s = ss.toCharArray();
        if(s.length == 0){
            return "";
        }
        int count = 1;
        StringBuilder sd = new StringBuilder();
        for(int i = 0;i < s.length - 1;i++){
            if(s[i] == s[i + 1]){
                count++;
            }else{
                sd.append(s[i]);
                if(count != 1){
                    sd.append(count);
                }
                count = 1;
            }
        }
        sd.append(s[s.length - 1]);
        if(count != 1){
            sd.append(count);
        }
        String ans = new String(sd);

        return ans;
    }
}
