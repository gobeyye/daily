package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-30
 * Time: 16:36
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1.创建 dp 表
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = in.nextInt();
        }
        int[] f = new int[n];
        int[] g = new int[n];
        //2.初始化
        f[0] = 0;
        g[n - 1] = 0;

        //3.填表
        for(int i = 1;i < n;i++){
            if(arr[i] > arr[i - 1]){
                f[i] = f[i - 1];
            }else{
                f[i] = f[i - 1] + 1;
            }
        }
        for(int i = n - 2;i >= 0;i--){
            if(arr[i] > arr[i + 1]){
                g[i] = g[i + 1];
            }else{
                g[i] = g[i + 1] + 1;
            }
        }
        //4.返回值
        int min = 1010;
        for(int i = 0;i < n;i++){
            // if(i == 0){
            //     min = Math.min(min,g[0]);
            // }else if(i == n - 1){
            //     min = Math.min(min,f[n - 1]);
            // }else{
            //     min = Math.min(f[i] + g[i + 1],min);
            // }
            min = Math.min(min,f[i] + g[i]);
        }
        System.out.println(min);
    }
}
