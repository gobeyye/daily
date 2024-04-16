/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    public static String modifyString(String ss) {
        char[] s = ss.toCharArray();
        int n = s.length;
        for(int i = 0;i < s.length;i++){
            if(s[i] == '?'){
                for(int j = 0;j < 26;j++){
                    char ch = (char)('a' + j);
                    if(i == 0){
                        if(ch != s[i + 1]){
                            s[i] = ch;
                            break;
                        }

                    }else if(i == n - 1){
                        if(ch != s[i - 1]){
                            s[i] = ch;
                            break;
                        }

                    }else{
                        if(ch != s[i - 1] && ch != s[i + 1]){
                            s[i] = ch;
                            break;
                        }
                    }

                }
            }
        }
        String ans = s.toString();
        return ans;

    }
    public static void main(String[] args) {
        char[] ss = {'a','b','c'};
        String s = new String(ss);
        System.out.println(s);
    }
}