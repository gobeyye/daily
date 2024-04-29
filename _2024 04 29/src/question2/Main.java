package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-29
 * Time: 20:54
 */
import java.util.*;
// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] nums = new Integer[n];
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums,(o1,o2)->o2 - o1);
        long sum = 0;
        for(int i = 1;n > 0;i += 2,n--){
            sum += nums[i];
        }
        System.out.println(sum);
    }
}
