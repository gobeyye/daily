package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-01
 * Time: 20:03
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static boolean check(int n){
        String tmp = "" + n;
        int len = tmp.length();
        if(len == 1){
            return false;
        }
        int[] nums = new int[tmp.length()];
        for(int i = 0;i < tmp.length();i++){
            nums[i] = (int)(tmp.charAt(i) - '0');
        }
        for(int i = 0;i < len;i++){
            for(int j = i + 1;j < len;j++){
                if(nums[i] != 0){
                    int a = nums[i] * 10 + nums[j];
                    if(zhishu(a)){
                        return true;
                    }
                }
                if(nums[j] != 0){
                    int b = nums[j] * 10 + nums[i];
                    if(zhishu(b)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean zhishu(int n){
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     int a = in.nextInt();
    //     int b = in.nextInt();
    //     int count = 0;
    //     boolean key = check(12);
    //     // System.out.println(key);
    // }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int count = 0;
        for(int i = a;i <= b;i++){
            if(check(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
