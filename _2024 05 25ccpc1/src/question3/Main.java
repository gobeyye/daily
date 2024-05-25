package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-25
 * Time: 22:16
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {0,2,5,114,514};
        int x = 534;
        for(int i = 0;i < nums.length;i++){
            nums[i] = nums[i] & x;
        }
        for(int k:nums){
            System.out.print(k + " ");
        }
    }
}
