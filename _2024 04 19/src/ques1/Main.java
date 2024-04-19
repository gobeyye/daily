package ques1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-19
 * Time: 22:20
 */
import java.math.BigInteger;
public class Main {
    public String solve (String s, String t) {
        BigInteger a = new BigInteger(s);
        BigInteger b = new BigInteger(t);
        a = a.add(b);
        String ans = a.toString();
        return ans;
    }
}
