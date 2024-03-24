package question4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-24
 * Time: 22:27
 */
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        int[] sortNums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
            sortNums[i] = nums[i];
        }
        Arrays.sort(sortNums);
        if(n % 2 == 1){
            //奇数情况
            int mid = sortNums[n / 2];
            for(int i = 0;i < n;i++){
                if(nums[i] >= mid){
                    System.out.print(0 + " ");
                }else{
                    int k = mid - nums[i] + 1;
                    System.out.print(k + " ");
                }
            }
        }else{
            //偶数情况
            int mid = sortNums[n / 2];
            for(int i = 0;i < n;i++){
                if(nums[i] >= mid){
                    System.out.print(0 + " ");
                }else{
                    int k = mid - nums[i];
                    System.out.print(k + " ");
                }
            }

        }

    }
}
