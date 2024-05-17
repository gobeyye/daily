package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-17
 * Time: 20:16
 */
import java.util.*;


// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),k = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        int count = 1;
        int path = 1;
        for(int i = 1;i < n;i++){
            if(nums[i] - nums[0] <= k){
                count++;
            }
        }
        for(int i = n - 2;i >= 0;i--){
            if(nums[n - 1] - nums[i] <= k){
                path++;
            }
        }
        count = Math.max(count,path);
        System.out.println(count);
    }
}
