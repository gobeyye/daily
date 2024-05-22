package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-22
 * Time: 20:31
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1.9个数字求出来
        String ss = in.next();
        int n = ss.length();
        int[] nums = new int[9];
        int j = 0;
        for(int i = 0;i < n - 1;i++){
            if(ss.charAt(i) >= '0' && ss.charAt(i) <= '9'){
                nums[j++] = ss.charAt(i) - '0';
            }
        }
        //题目告诉你不会出错
        long sum = 0;
        for(int i = 0;i < 9;i++){
            long tmp = (i + 1) * nums[i];
            sum += tmp;
        }
        //2.判断
        if((sum % 11) == ss.charAt(n - 1) - '0'){
            System.out.println("Right");
        }else{
            for(int i = 0;i < n - 1;i++){
                System.out.print(ss.charAt(i));
            }
            if(sum % 11 == 10){
                System.out.print("X");
            }else{
                System.out.print(sum % 11);
            }
        }

    }
}
