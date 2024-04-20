package test4;



/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-20
 * Time: 13:54
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),m = in.nextInt();
        int[] nums = new int[m];
        int sum = 0;
        for(int i = 0;i < m;i++){
            nums[i] = in.nextInt();
            sum += nums[i];
        }
        int k = sum / n;
        int h = sum % n;
        int ans = h / (m - k);
        System.out.println(ans);

    }
}
