package question7;
//解法一：暴力骗分
/*import java.util.Scanner;

public class Main{
    static long ret;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        int MOD = 1000000007;
        dfs(nums,0);
        System.out.println(ret % MOD);
    }
    public static void dfs(int[] nums,int step){
        if(step == nums.length){
            ret++;
            return;
        }
        for(int i = step;i < nums.length;i++){
            if(check(nums,step,i)){
                dfs(nums,i + 1);
            }
        }
    }
    private static boolean check(int[] a, int l, int r) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }
        return max - min == r - l;
    }

}*/




//解法二：动态规划
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums=  new int[n + 1];
        for(int i = 1;i <= n;i++){
            nums[i] = in.nextInt();
        }
        int MOD = 1000000007;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            for (int j = i; j > 0; j--) {
                max = Math.max(max,nums[j]);
                min = Math.min(min,nums[j]);
                if(max - min == i - j){
                    dp[i] = (dp[i] + dp[j - 1]) % MOD;
                }
            }
        }
        //蓝桥杯不是return而是Println
        System.out.println(dp[n]);
    }


   /* for (int j = i; j > 0; j--) {
        max = Math.max(max, nums[j]);
        min = Math.min(min, nums[j]);
        //如果a[j, i]是一段连续的自然数，那么就有以a[i]结尾的合法切分合法数量+=以a[j - 1]结尾的合法切分数量
        //即f[i] += f[j - 1]
        if (max - min == i - j)
            dp[i] = (dp[i] + dp[j - 1]) % MOD;
    }*/


   /* public static boolean check(int[] nums,int i,int j){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int left = i;left <= j;left++){
            max = Math.max(max,nums[left]);
            min = Math.min(min,nums[left]);
        }
        return (max - min) == j - i;
    }*/

}








/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-24
 * Time: 23:36
 */
/*
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int MOD = 1000000007;
        int n = in.nextInt();
        int[] nums = new int[n];
        int[] dp = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        dp[0] = 1;
        for(int i = 1;i < n;i++){
            dp[i] = 1;
            int[] temp = new int[n];
            temp[0] = nums[i];
            int index = 1;
            boolean key = true;
            for(int j = i - 1;j >= 0;j--){
                temp[index++] = nums[j];
                Arrays.sort(temp);
                for(int k = 0;k < index - 1 && key == true;k++){
                    if(temp[k + 1] - temp[k] != 1){
                        key = false;
                    }
                }
                if(key == true){
                    dp[i] += dp[j];
                }
            }
        }
        for(int i = 0;i < n;i++){
            System.out.println(dp[i]);
        }
    }
}
*/













/*import java.util.Scanner;

public class Main {
    static int res = 0, mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        dfs(a, 0);
        System.out.println(res % mod);
    }

    private static void dfs(int[] a, int startindex) {
        int n = a.length;
        if (startindex == n) {
            res ++;
            return;
        }
        for (int i = startindex; i < n; i++) {
            if (check(a, startindex, i)) {
                dfs(a, i + 1);
            }
        }
    }

    private static boolean check(int[] a, int l, int r) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = l; i <= r; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }
        return max - min == r - l;
    }
}*/
