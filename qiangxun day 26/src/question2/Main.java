package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-13
 * Time: 19:54
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        //1.创建 dp 表
        //2.初始化
        //3.填表
        //4.返回值
        int[] f = new int[n];
        int[] g = new int[n];
        f[0] = nums[0];
        for(int i = 1;i < n;i++){
            f[i] = g[i - 1] + nums[i];
            g[i] = Math.max(g[i - 1],f[i - 1]);
        }
        System.out.println(Math.max(g[n - 1],f[n - 1]));
    }
}
