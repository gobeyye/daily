package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-18
 * Time: 10:49
 */
public class test1 {
    public static void main(String[] args) {
        int[] nums = {1,4,7,0};
        int x = 100;
        int l = 0,r = 2;
        while(r > l){
            int mid = l + (r - l) / 2;
            if(nums[mid] >= x){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        nums[l] = x;
        for(int a:nums){
            System.out.print(a + " ");
        }
    }
}
