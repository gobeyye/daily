package test1;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-06
 * Time: 10:48
 */
public class test4 {
    public static boolean backspaceCompare(String s, String t) {
        //1.创建 栈
        StringBuilder sd1 = new StringBuilder();
        StringBuilder sd2 = new StringBuilder();
        int k = 0;
        int n = s.length(),m = t.length();
        //2.利用栈来得到最终字符串
        for(int i = 0;i < n;i++){
            if(sd1.length() > 0 && s.charAt(i) == '#'){
                sd1.deleteCharAt(sd1.length() - 1);
            }else{
                if(s.charAt(i) == '#'){//特判，字符串为空，且另一个字符为'#'
                    continue;
                }
                sd1.append(s.charAt(i));
            }
        }
        String ans1 = sd1.toString();
        for(int i = 0;i < m;i++){
            if(sd2.length() > 0 && t.charAt(i) == '#'){
                sd2.deleteCharAt(sd2.length() - 1);
            }else{
                if(t.charAt(i) == '#'){//特判
                    continue;
                }
                sd2.append(t.charAt(i));
            }
        }
        String ans2 = sd2.toString();
        //3.比较
        return ans1.equals(ans2);
    }
    public static void main(String[] args) {
        String s1 = "a#c";
        String s2 = "b";
        boolean key = backspaceCompare(s1,s2);
        System.out.println(key);
    }
}
