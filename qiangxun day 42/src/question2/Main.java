package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-02
 * Time: 9:25
 */


//import java.util.*;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        //1.dp
//        //读入数据
//        int n = in.nextInt(),aim = in.nextInt();
//        int[] arr = new int[n + 1];
//        for(int i = 1;i <= n;i++){
//            arr[i] = in.nextInt();
//        }
//        //2.创建 dp 表
//        int[][] dp = new int[n + 1][aim + 1];
//        //3.初始化
//        Arrays.fill(dp[0],-1);
//        dp[0][0] = 0;
//        //4.填表
//        for(int i = 1;i <= n;i++){
//            for(int j = 1;j <= aim;j++){
//                dp[i][j] = dp[i - 1][j];
//                if(j >= arr[i] && dp[i][j - arr[i]] != -1){
//                    if(dp[i][j] == -1){//取最小值的时候要注意 -1 或者 负数，不符合条件的
//                        //情况非常恶心
//                        dp[i][j] = dp[i][j - arr[i]] + 1;
//
//                    }else{
//                        dp[i][j] = Math.min(dp[i][j],dp[i][j - arr[i]] + 1);
//                    }
//                }
//            }
//        }
//        //5.返回值
//        System.out.println(dp[n][aim]);
//    }
//}


//优化

import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1.dp
        //读入数据
        int n = in.nextInt(), aim = in.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = in.nextInt();
        }
        //2.创建 dp 表
        int[] dp = new int[aim + 1];
        //3.初始化
        Arrays.fill(dp, -1);
        dp[0] = 0;
        //4.填表
        for (int i = 1; i <= n; i++) {
            for (int j = arr[i]; j <= aim; j++) {
                if(dp[j - arr[i]] != -1){
                    if (dp[j] == -1) {//取最小值的时候要注意 -1 或者 负数，不符合条件的
                        //情况非常恶心
                        dp[j] = dp[j - arr[i]] + 1;
                    } else {
                        dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
                    }
                }
            }
        }
        //5.返回值
        System.out.println(dp[aim]);
    }
}