package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-02
 * Time: 9:24
 */





import java.util.*;


public class Main {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param A int整型一维数组
     * @param n int整型
     * @return int整型
     */
    public int getDis (int[] A, int n) {
        // write code here
        int len = A.length;
        int[] dp = new int[len];
        int max = 0;
        //1.预处理
        for(int i = len - 1;i >= 0;i--){
            max = Math.max(max,A[i]);
            dp[i] = max;
        }
        //2.遍历求最大值
        max = 0;
        for(int i = 0;i < n;i++){
            max = Math.max(dp[i] - A[i],max);
        }
        return max;
    }
}