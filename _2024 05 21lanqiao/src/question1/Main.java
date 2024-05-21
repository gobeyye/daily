package question1;



/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-21
 * Time: 8:25
 */






import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
        int MOD = (int)(1e9 + 7);
        BigInteger b7 = BigInteger.valueOf(7), b17 = BigInteger.valueOf(17), b119 = BigInteger.valueOf(119);
        BigInteger target = BigInteger.valueOf(2023).pow(2023);
        BigInteger cnt7 = target.divide(b7), cnt17 = target.divide(b17), cnt119 = target.divide(b119);
        System.out.println(target.subtract(cnt7).subtract(cnt17).add(cnt119).mod(BigInteger.valueOf((int)1e9 + 7)));
    }
}
