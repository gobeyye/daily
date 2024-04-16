package test3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-16
 * Time: 19:41
 */
import java.util.Scanner;
import java.util.*;
// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),k = in.nextInt();
        Integer[] nums = new Integer[n];
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        while(k > 0){
            Arrays.sort(nums,(o1,o2)->o2-o1);
            for(int i = 0;i < n;i++){
                if(nums[i] % 2 == 0){
                    nums[i] /= 2;
                    break;
                }
            }
            k--;
        }
        long sum = 0;
        for(int x:nums){
            sum += x;
        }
        System.out.println(sum);
    }
}
