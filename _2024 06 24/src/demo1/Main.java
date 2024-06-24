package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-24
 * Time: 9:54
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),k = in.nextInt();
        int INF = 1 << n;//不能多，legal 会多，就会导致结果偏大
        int[] cnt = new int[INF];//前缀和，表示数字对应的二进制下 1 的个数
        int[] legal = new int[INF];//表示左右合法的状态是什么
        int len = 0;//记录 legal 的个数
        for(int i = 0;i < INF;i++){
            int tmp = i;
            int count = 0;
            while(tmp != 0){
                if((tmp & 1) == 1) count++;
                tmp >>= 1;
            }
            cnt[i] = count;
//            if((((i >> 1) | (i << 1)) & i) != 1) legal[len++] = i;
            if((((i >> 1) | (i << 1)) & i) == 0) legal[len++] = i;

        }
        long[][][] dp = new long[n + 1][k + 1][INF];
        dp[0][0][0] = 1;
        for(int i = 1;i <= n;i++){
            for(int a = 0;a < len;a++){
                int s1 = legal[a];
                for(int b = 0;b < len;b++){
                    int s2 = legal[b];
                    if(((s2 | (s2 >> 1) | (s2 << 1)) & s1) == 0){
                        for(int j = 0;j <= k;j++){
                            if(j - cnt[s1] >= 0){
                                dp[i][j][s1] += dp[i - 1][j - cnt[s1]][s2];
                            }
                        }
                    }

                }
            }
        }
        long sum = 0;
        for(int i = 0;i < len;i++){
            sum += dp[n][k][legal[i]];
        }
        System.out.println(sum);

    }
}