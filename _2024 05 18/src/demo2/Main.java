package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-18
 * Time: 11:21
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),p = in.nextInt();
        //1.输入数据
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        //2.枚举温度
        int max = 0;
        for(int i = nums[0];i <= nums[n - 1];i++){
            max = Math.max(max,search(nums,i - p,i + p));
        }
        System.out.println(max);
    }
    public static int search(int[] nums,int x,int y){
        //3.1先找左区间
        int n = nums.length;
        int ansLeft = 0,ansRight = 0;
        //左模板
        int left = 0,right = n - 1;
        while(right > left){
            int mid = left + (right - left) / 2;
            if(nums[mid] >= x){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        ansLeft = left;
        //3.2再找右区间
        //右模板
        left = 0;right = n - 1;
        while(right > left){
            int mid = left + (right - left + 1) / 2;
            if(nums[mid] <= y){
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        ansRight = left;
        return ansRight - ansLeft + 1;
    }
}