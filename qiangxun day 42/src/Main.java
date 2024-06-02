/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */




//
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
//        int[] dp = new int[aim + 1];
//        //3.初始化
//        Arrays.fill(dp,-1);
//        dp[0] = 0;
//        //4.填表
//        for(int i = 1;i <= n;i++){
//            for(int j = arr[i];j <= aim;j++){
//                if(j >= arr[i] && dp[j - arr[i]] != -1){
//                    if(dp[j] == -1){//取最小值的时候要注意 -1 或者 负数，不符合条件的
//                        //情况非常恶心
//                        dp[j] = dp[j - arr[i]] + 1;
//
//                    }else{
//                        dp[j] = Math.min(dp[j],dp[j - arr[i]] + 1);
//                    }
//                }
//            }
//        }
//        //5.返回值
//        System.out.println(dp[aim]);
//    }
//}



import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1.dp
        //读入数据
        int n = in.nextInt(),aim = in.nextInt();
        int[] arr = new int[n + 1];
        for(int i = 1;i <= n;i++){
            arr[i] = in.nextInt();
        }
        //2.创建 dp 表
        int[] dp = new int[aim + 1];
        //3.初始化
        Arrays.fill(dp,-1);
        dp[0] = 0;
        //4.填表
        for(int i = 1;i <= n;i++){

            for(int j = arr[i];dp[j - arr[i]] != -1 && j <= aim;j++){//一旦条件错误，直接跳出循环, 循环的条件一定要注意
                //只有一次机会

                    if(dp[j] == -1){//取最小值的时候要注意 -1 或者 负数，不符合条件的
                        //情况非常恶心
                        dp[j] = dp[j - arr[i]] + 1;
                    }else{
                        dp[j] = Math.min(dp[j],dp[j - arr[i]] + 1);
                    }

            }

        }
        //5.返回值
        System.out.println(dp[aim]);
    }
}
