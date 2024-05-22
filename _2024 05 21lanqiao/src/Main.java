/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static int gcd(int a,int b){
        return b != 0 ? gcd(b,a % b) : a;
    }
    public static int gcd1(int a,int b){
        int c = 1;
        while(c != 0){
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 2,b = 12;
        System.out.println(gcd1(2,b));
    }
}

