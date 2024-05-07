package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-07
 * Time: 21:22
 */
//解法1：中心扩展算法（错误解法）
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        char[] s = in.next().toCharArray();
//        int n = s.length;
//        int max = 0;
//        //1.遍历
//        for (int i = 0; i < n; i++) {
//            //2.分奇偶
//            //奇数
//            int left = i - 1;
//            int right = i + 1;
//            while (left >= 0 && right < n && s[left] != s[right]) {
//                left--;
//                right++;
//            }
//            //3.记录最长长度
//            if (right - left - 1 > max) {
//                max = right - left - 1;
//            }
//            //偶数情况
//            left = i;
//            right = i + 1;
//            while (left >= 0 && right < n && s[left] != s[right]) {
//                left--;
//                right++;
//            }
//            //3.记录最长长度
//            if (right - left - 1 > max) {
//                max = right - left - 1;
//            }
//        }
//        System.out.println(max);
//    }
//}


//解法二：dp表辅助超时优化
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        char[] s = in.next().toCharArray();
//        int n = s.length;
//        int max = 0;
//        //1.创建 dp 表
//        //2.初始化
//        //3.填表
//        //4.返回值
//        boolean[] dp = new boolean[n];
//        for (int i = n - 1; i >= 0; i--) {
//            for (int j = n - 1; j >= i; j--) {
//                if (s[i] == s[j]) {
//                    dp[i] = (i + 1 < j) ? dp[i + 1] : true;
//                    if(dp[i] == false) {
//                        max = Math.max(max, j - i + 1);
//                    }
//                }else{
//                    dp[i] = false;
//                    max = Math.max(max, j - i + 1);
//                }
//
//            }
//        }
//        System.out.println(max);
//
//    }
//}
//dp表未优化
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] s = in.next().toCharArray();
        int n = s.length;
        int max = 0;
        //1.创建 dp 表
        //2.初始化
        //3.填表
        //4.返回值
        boolean[] dp = new boolean[n];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (s[i] == s[j]) {
                    dp[j] = (i + 1 < j) ? dp[j - 1] : true;
                    if(dp[j] == false) {
                        max = Math.max(max, j - i + 1);
                    }
                }else{
                    dp[j] = false;
                    max = Math.max(max, j - i + 1);
                }

            }
        }
        System.out.println(max);

    }
}