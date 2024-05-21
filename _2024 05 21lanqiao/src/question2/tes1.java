package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-21
 * Time: 12:57
 */

public class tes1 {


    public static long fpow(int a,int b){
        //优化快速幂,写法比较简洁而已
        //a是底数，b 是指数，mod是b + 2
        int MOD = (b + 2);
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
    public static void main(String[] args) {
        long ans = 0;
        int M = 2146516019; //忘记了是多少
        for (int i = 1; i <= 1000; i ++) {
            if(i % 10 == 0){
                System.out.println(i);
            }
            ans ^= fpow(i, M - 2);
        }
        System.out.println(ans);
    }
}

