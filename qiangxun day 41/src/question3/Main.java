package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-30
 * Time: 22:01
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static int ret = 5000;
    static int n;
    static int[] arr;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //打暴力
        n = in.nextInt();
        arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = in.nextInt();
        }
        if (arr[1] < 0) {
            System.out.println(-1);
            return;
        }
        dfs(1, 0);
        if (ret >= 5000) {
            System.out.println(-1);
            return;
        }
        System.out.println(ret);
    }
    public static void dfs(int step, int time) {
        if (step == n) {
            ret = Math.min(time, ret);
        }
        if (step > n) {
            return;
        }
        if (time > 5000) {
            return;
        }

        //整数
        for (int i = step + 1; i <= step + arr[step]; i++) {
            if(arr[i] < 0){
                continue;
            }
            dfs(i, time + 1);
        }

        // }else{
        //     //负数
        //     if(step + arr[step] < 1){
        //         dfs(1,time + 1);
        //     }
        //     for(int i = step + arr[step];i >= 1;i--){
        //         dfs(i,time + 1);
        //     }
        // }

    }
}
