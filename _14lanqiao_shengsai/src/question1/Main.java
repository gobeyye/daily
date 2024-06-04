package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-04
 * Time: 14:51
 */

import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int MOD = (int) 1e9;
        long sum = 0;//保存和
        long mul = 1;
        for (int i = 1; i < 50; i++) {//阶乘的求法
            mul = (mul * i) % MOD;
            sum = (sum + mul) % MOD;
            System.out.println(i + ": " + sum);
        }
        System.out.println(sum);
    }
}
