import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    public static void main1(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),p = in.nextInt();
        int minLeft = 0,maxRight = 0;
        //1.输入值保存最大和最小值
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        minLeft = nums[0];
        maxRight = nums[n - 1];
        //2.枚举温度，二分优化
        int ansMax = 0;
//        for(int i = minLeft;i <= maxRight;i++){
//            int tmp = search(nums,i - p,p + i);
//            if(ansMax < tmp){
//                ansMax = tmp;
//            }
//        }

        System.out.println(ansMax);

    }

    public static void main(String[] args) {
        int[] nums = {1,5,3,2,4,6};
        Arrays.sort(nums);
        System.out.println(search(nums, 1, 5));
    }
    public static int search(int[] nums,int x,int y){
        //先查找左区间
        int n = nums.length;
        int left = 0,right = n - 1;
        int ansLeft = 0,ansRight = 0;
        while(right > left){
            int mid = left + (right - left) / 2;
            if(nums[mid] >= x){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        ansLeft = left;

        System.out.println(left);
        //再查找右区间
        left = 0;right = n - 1;
        while(right > left){
            int mid = left + (right - left + 1) / 2;//////////////////
            if(nums[mid] > y){
                right = mid - 1;
            }else{
                left = mid;
            }
        }
        ansRight = left;
//        System.out.println(left);
        return ansRight - ansLeft + 1;
    }
    //这是有问题的
    public static int search1(int[] nums,int x,int y){
        //先查找左区间
        int n = nums.length;
        int left = 0,right = n - 1;
        int ansLeft = 0,ansRight = 0;
        while(right > left){
            int mid = left + (right - left) / 2;
            if(nums[mid] <= x){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        ansLeft = left;
        //再查找右区间
        left = 0;right = n - 1;
        while(right > left){
            int mid = left + (right - left + 1) / 2;
            if(nums[mid] < y){
                right = mid - 1;
            }else{
                left = mid;
            }
        }
        ansRight = left;
        return ansRight - ansLeft + 1;
    }
}