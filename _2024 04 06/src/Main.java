
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    public static void main(String[] args) {

    }
    public static int[] missingTwo(int[] nums) {
        int ans = 0;
        int n = nums.length + 2;
        for(int i = 0;i < nums.length;i++){
            ans ^= nums[i];
        }
        for(int i = 1;i <= n;i++){
            ans ^= i;
        }
        int diff = ans & (-ans);
        int[] ret = new int[2];
        for(int x : nums)
            if(((x >> diff) & 1) == 1) ret[1] ^= x;
            else ret[0] ^= x;
        for(int i = 1; i <= nums.length + 2; i++)
            if(((i >> diff) & 1) == 1) ret[1] ^= i;
            else ret[0] ^= i;
        return ret;
    }
    public int[] missingTwo2(int[] nums) {
        int[] ret = new int[2];
        int ans = 0;
        if(nums == null){
            return ret;
        }
        int n = nums.length + 2;
        for(int i = 0;i < nums.length;i++){
            ans ^= nums[i];
        }
        for(int i = 1;i <= n;i++){
            ans ^= i;
        }
        int index = ans & (-ans);
        int x = 0;
        int y = 0;
        for(int i = 0;i < nums.length;i++){
            if((nums[i] & (index)) == 1){
                x ^= nums[i];
            }else{
                y ^= nums[i];
            }
        }
        for(int i = 1;i <= n;i++){
            if((i & (index)) == 1){
                x ^= i;
            }else{
                y ^= i;
            }
        }
        ret[0] = x;
        ret[1] = y;
        return ret;
    }
}