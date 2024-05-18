package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-18
 * Time: 9:08
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1,4,5,7};
        int x = 3;
        int l = 1,r = 3;
//        //查找左端点
//        while(r > l){
//            int mid = l + (r - l) / 2;
//            if(nums[mid] >= x){
//                r = mid;
//            }else{
//                l = mid + 1;
//            }
//        }
//        nums[l] = x;
        //查找右端点
        while(r > l){
            int mid = l + (r - l + 1) / 2;
            if(nums[mid] <= x){
                l = mid;
            }else{
                r = mid - 1;
            }
        }
        nums[l] = x;
        for(int a:nums){
            System.out.print(a + " ");
        }
    }
}
