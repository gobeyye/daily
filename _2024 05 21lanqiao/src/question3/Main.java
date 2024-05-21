package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-21
 * Time: 12:58
 */







//简单的贪心
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] nums = new long[2 * n];
        for(int i = 0;i < 2 * n;i++){
            nums[i] = in.nextInt();
        }
        long sum = 0;//最后的答案
        Arrays.sort(nums);
        int right = (2 * n) - 1;
        int left = 0;
        while(right > left){
            sum += (nums[right] * nums[left]);
            right--;
            left++;
        }
        System.out.println(sum);
    }
}
