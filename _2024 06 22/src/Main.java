/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),k = in.nextInt();
        int INF = (1 << n);//对应 n 个位置的所有情况
        long[][][] dp = new long[n + 1][k + 1][INF];
        int[] cnt = new int[INF];//表示 s 对应二进制的个数
        int[] ok = new int[INF];//存储左右边合法的 s
        int a = 0;
        //初始化 cnt ，cnt 算是前缀和数组
        for(int s = 0;s < INF;s++){
            int tmp = s;
            while(tmp != 0){
                if((tmp & 1) == 1) cnt[s]++;
                tmp >>= 1;//左移 1 位
            }
            if(((s >> 1 | s << 1) & s) == 0){
                ok[a++] = s;
            }
        }
        dp[0][0][0] = 1;//没有的放也是一种方案
        for(int i = 1;i <= n;i++){//枚举行
            for(int l = 0;l < a;l++){//枚举 s2 状态
                int s2 = ok[l];
                for(int r = 0;r < a;r++){//枚举 s1 状态
                    int s1 = ok[r];
                    if(((s2 | (s2 >> 1) | (s2 << 1)) & s1) == 0){//上下行合法情况
                        for(int j = 0;j <= k;j++){//枚举国王数
                            if(j - cnt[s2] >= 0){
                                dp[i][j][s2] += dp[i - 1][j - cnt[s2]][s1];
                            }
                        }
                    }
                }
            }
        }
        long ans = 0;
        for(int i = 0;i < a;i++){
            ans += dp[n][k][ok[i]];//答案的合法情况有很多
        }
        System.out.println(ans);
    }
}