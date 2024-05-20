package demo4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-20
 * Time: 17:18
 */
import java.util.*;
class GetToken{
    String s[];
    public String getToken(int index,String str){
        StringTokenizer fenxi = new StringTokenizer(str);
        int number = fenxi.countTokens();
        s = new String[number + 1];
        int k = 1;
        while(fenxi.hasMoreTokens()){
            String temp = fenxi.nextToken();
            s[k] = temp;
            k++;
        }
        if(index <= number){
            return s[index];
        }else{
            return null;
        }
    }
}
public class E {
    public static void main(String[] args) {
        String str = "We Love This Game";
        GetToken token = new GetToken();
        String s1 = token.getToken(2,str),s2 = token.getToken(4,str);
        System.out.println(s1 + ":" + s2);
    }
}
