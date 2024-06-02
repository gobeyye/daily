package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-02
 * Time: 9:43
 */




//错误的做法
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        //双指针
//        //开 long 来记录选取方案
//        int n = in.nextInt(), l = in.nextInt(), r = in.nextInt();
//        char[] s = in.next().toCharArray();
//        long ret = 0;
//        //滑动窗口
//        int left = 0, right = 0;
//        int[] hash = new int[26];
//        int path = 0;//记录路径的元素种类
//        while (right < n) {
//            //1.进窗口
//            if (hash[s[right] - 'a'] == 0) {
//                path++;
//            }
//            hash[s[right] - 'a']++;
//            //2.判断
//            while (path > r) {
//                hash[s[left] - 'a']--;
//                if (hash[s[left] - 'a'] == 0) {
//                    path--;
//                }
//                if (path >= l && path <= r) {
//                    //4.更新结果
//                    ret++;
//                }
//                //3.出窗口
//                left++;
//            }
//            if (path >= l && path <= r) {
//                //4.更新结果
//                ret++;
//            }
//            right++;
//        }
//        while (path >= r) {
//            hash[s[left] - 'a']--;
//            if (hash[s[left] - 'a'] == 0) {
//                path--;
//            }
//            if (path >= l && path <= r) {
//                //4.更新结果
//                ret++;
//            }
//            //3.出窗口
//            left++;
//        }
//
//        System.out.println(ret);
//    }
//}

//正确的做法
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),l = in.nextInt(),r = in.nextInt();
        char[] s = in.next().toCharArray();
        long[] dp1 = new long[n];//记录1 到 l - 1
        long[] dp2 = new long[n];//记录1 到 r
        int left = 0,right = 0;
        int path = 0;
        int[] hash = new int[26];
        while(right < n){
            //进窗口
            if(hash[s[right] - 'a'] == 0){
                path++;
            }
            hash[s[right] - 'a']++;
            while(path > l - 1){//判断 + 出窗口
                hash[s[left] - 'a']--;
                if(hash[s[left] - 'a'] == 0){
                    path--;
                }
                left++;
            }
            dp1[right] = right - left + 1;
            right++;
        }
        left = 0;right = 0;
        hash = new int[26];
        path = 0;
        while(right < n){
            //进窗口
            if(hash[s[right] - 'a'] == 0){
                path++;
            }
            hash[s[right] - 'a']++;
            while(path > r){//判断 + 出窗口
                hash[s[left] - 'a']--;
                if(hash[s[left] - 'a'] == 0){
                    path--;
                }
                left++;
            }
            dp2[right] = right - left + 1;
            right++;
        }
        long ret = 0;
        for(int i = 0;i < n;i++){
            ret += dp2[i] - dp1[i];
        }
        System.out.println(ret);

    }
}