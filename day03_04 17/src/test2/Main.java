package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-16
 * Time: 19:41
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),x = in.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        int len = 0;
        int ans = Integer.MAX_VALUE;
        int ansleft = 0;
        int ansright = 0;
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        for(int right = 0,left = 0;right < n;right++){
            sum += nums[right];
            len++;
            while(left <= right && sum >= x){
                if(ans > len){
                    ans = len;
                    ansleft = left;
                    ansright = right;
                }
                sum -= nums[left++];
                len--;
            }
        }
        System.out.print((ansleft + 1) + " " + (ansright + 1));
    }
}