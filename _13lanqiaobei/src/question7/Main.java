package question7;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-24
 * Time: 23:36
 */
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int MOD = 1000000007;
        int n = in.nextInt();
        int[] nums = new int[n];
        int[] dp = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        dp[0] = 1;
        for(int i = 1;i < n;i++){
            dp[i] = 1;
            int[] temp = new int[n];
            temp[0] = nums[i];
            int index = 1;
            boolean key = true;
            for(int j = i - 1;j >= 0;j--){
                temp[index++] = nums[j];
                Arrays.sort(temp);
                for(int k = 0;k < index - 1 && key == true;k++){
                    if(temp[k + 1] - temp[k] != 1){
                        key = false;
                    }
                }
                if(key == true){
                    dp[i] += dp[j];
                }
            }
        }
        for(int i = 0;i < n;i++){
            System.out.println(dp[i]);
        }
    }
}
