package question2;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-21
 * Time: 10:21
 */
//在下面












public class Main {
    public static long fpow(long a,long b){
        //优化快速幂,写法比较简洁而已
        //a是底数，b 是指数，mod是b + 2
        long MOD = (b + 2);
        long ans = 1;
        while(b > 0){
            if((b & 1) == 1){
                //奇数的情况
                ans = (ans * a) % MOD;
            }
            b >>=1;
            a = (a * a) % MOD;
        }
        return ans;
    }
    //暴力
    public static void main(String[] args) {
        long ret = 0;
        int M = 2146516019;
        for(int i = 1;i <= 233333333;i++){
            if(i % 10 == 0){
                System.out.println(i);
            }
            long tmp = fpow(i,M - 2);//mod 是 M + 2
            ret ^= tmp;
        }
        System.out.println(ret);
    }

}
