package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-04
 * Time: 16:19
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int MOD = (int) 1e9 + 7;
        //dp
        int T = in.nextInt();
        while (T > 0) {
            int n = in.nextInt();
            int[] nums = new int[n + 1];
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                nums[i] = in.nextInt();
                sum += nums[i];
            }
            if (sum % 2 == 1) {//特判
                System.out.println(0);
            }else {
                //1.创建 dp 表
                int[] f = new int[n + 1];
                int[] g = new int[n + 1];
                f[0] = 1;
                //2.初始化
                //3.填表
                for (int i = 1; i <= n; i++) {
                    if (nums[i] % 2 == 0) {
                        //偶数情况
                        f[i] = (2 * f[i - 1]) % MOD;
                        g[i] = (2 * g[i - 1]) % MOD;
                    } else {
                        //奇数情况
                        f[i] = (f[i - 1] + g[i - 1]) % MOD;
                        g[i] = (f[i - 1] + g[i - 1]) % MOD;//sb了g + g，抄错了
                    }
                }
                //4.返回值
                System.out.println(f[n]);
            }
            T--;
        }
    }
}
