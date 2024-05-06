package test1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-06
 * Time: 8:18
 */
public class test1 {
    public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        StringBuilder sd = new StringBuilder();
        int j = 0;
        boolean key = true;
        while (true) {
            for (int i = 0; i < n - 1; i++) {
                if (j >= strs[i].length() || j >= strs[i + 1].length()) {
                    key = false;
                    break;
                }
                while (i < n - 1 && strs[i].charAt(j) == strs[i + 1].charAt(j)) {
                    i++;
                    if (j >= strs[i].length() || j >= strs[i + 1].length()) {
                        key = false;
                        break;
                    }

                }
                if(key == false){
                    break;
                }
                if (strs[i].charAt(j) != strs[i + 1].charAt(j)) {
                    key = false;
                    break;
                } else {
                    sd.append(strs[i].charAt(j++));
                }

            }
            if (key == false) {
                break;
            }

        }
        String ans = sd.toString();
        return ans;

    }
    public static void main(String[] args) {
        String[] ss = {"flower","flow","flight"};
        String ans = longestCommonPrefix(ss);
        System.out.println(ans);
    }
}
