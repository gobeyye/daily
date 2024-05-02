import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int n = nums.length;
        for(int i = 0;i < n;i++){
            if(map.containsKey(nums[i] - target)){
                ans[0] = nums[i];
                ans[1] = map.get(nums[i] - target);
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        twoSum(nums,9);

        System.out.println("Hello world!");
    }
}