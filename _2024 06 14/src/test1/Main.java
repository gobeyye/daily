package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-14
 * Time: 17:26
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),k = in.nextInt();
        int stateAll = (1 << n);//表示 1 行 n 个位置上的所有情况
        long[][][] dp = new long[n + 1][k + 1][stateAll];
        //预处理
        int[] cnt = new int[stateAll];//预处理所有状态的国王数
        int[] legalRow = new int[stateAll];
        int count = 0;//记录合法行的个数
        for(int i = 0;i < stateAll;i++){
            int tmp = i;//临时记录 i
            while(tmp != 0){
                if((tmp & 1) == 1) cnt[i]++;
                tmp >>= 1;//右移 1 位
            }
            if((((i >> 1) | (i << 1)) & i) == 0) legalRow[count++] = i;
        }
        //开始填 dp 表
        dp[0][0][0] = 1;//国王数为 0 ，什么都不填也是一种方案
        for(int i = 1;i <= n;i++){//枚举行数
            for(int ctS2 = 0;ctS2 < count;ctS2++){
                int s2 = legalRow[ctS2];
                for(int ctS1 = 0;ctS1 < count;ctS1++){
                    int s1 = legalRow[ctS1];
                    if(((s2 | (s2 >> 1) | (s2 << 1)) & s1) == 0 ){
                        for(int j = 0;j <= k;j++){
                            if(j - cnt[s2] >= 0){
                                dp[i][j][s2] += dp[i - 1][j - cnt[s2]][s1];
                            }
                        }
                    }
                }
            }
        }
        long ans = 0;
        for(int i = 0;i < count;i++){
            ans += dp[n][k][legalRow[i]];
        }
        System.out.println(ans);
    }
}
