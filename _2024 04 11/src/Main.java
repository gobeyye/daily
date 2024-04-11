/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] nums = new Integer[n + 1];
        nums[0] = 0;
        for(int i = 1;i <= n;i++) {
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
//        int fast = 2,slow = 1;
//        while(fast <= n && slow <= n) {
//            int min = Math.min(nums[fast],nums[slow]);
//            int mid = min / 2;
//            for(int i = fast;i <= n;i++) {
//                if(nums[i] != 0 && nums[i] <= mid) {
//                    nums[i] = 0;
//                    break;
//                }
//            }
//            fast += 2;
//            slow += 2;
//        }
//        long sum = 0;
//        for(int i = 1;i <= n;i++) {
//            sum += nums[i];
//        }
//        System.out.println(sum);
    }

}