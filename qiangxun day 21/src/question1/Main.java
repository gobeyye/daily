package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-08
 * Time: 21:09
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            nums[i] = i;
        }
        //1.分奇偶
        if (n % 2 == 0) {
            //偶数情况
            int fast = 3;
            int slow = 2;
            while (fast < n && slow < n) {
                int tmp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = tmp;
                fast += 2;
                slow += 2;
            }
            for (int i = 1; i <= n; i++) {
                System.out.print(nums[i] + " ");
            }
        } else {
            //奇数情况
            //偶数情况
            int fast = 3;
            int slow = 2;
            while (fast <= n && slow <= n) {
                int tmp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = tmp;
                fast += 2;
                slow += 2;
            }
            for (int i = 1; i <= n; i++) {
                System.out.print(nums[i] + " ");
            }
        }

    }
}