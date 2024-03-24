package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-24
 * Time: 21:58
 */
public class Main {
    public static void main(String[] args){
        int count = 0;
        for(long i = 2022;i <= 2022222022;i++){
            if(ishuiwen(i)){
                count++;
                //System.out.println(i);
            }
        }
        System.out.println(count);
    }
    public static boolean ishuiwen(long n){
        long[] nums = new long[10];
        int len = 0;
        while(n != 0){
            nums[len++] = n % 10;
            n /= 10;
        }
        int right = len - 1;
        int left = 0;
        int mid = right / 2;
        int begin = 1;
        while(begin <= mid){
            if(nums[begin] < nums[begin - 1]){
                return false;
            }
            begin++;
        }
        while(right > left){
            if(nums[right] != nums[left]){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}
