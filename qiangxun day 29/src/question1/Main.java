package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-16
 * Time: 21:33
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        int count = 1;//记录个数
        if(n == 1){
            System.out.println(count);
            return;
        }
        int[] panduan = new int[n];
        for(int i = 1;i < n;i++){
            if(nums[i] - nums[i - 1] > 0){
                panduan[i] = 1;
            }else if(nums[i] - nums[i - 1] == 0){
                panduan[i] = 0;
            }else{
                panduan[i] = -1;
            }
        }
        int key = panduan[1];
        for(int i = 2;i < n;i++){
            if(panduan[i] == 0 || panduan[i] == key){
                continue;
            }else{
                key = panduan[i];
                count++;
            }
        }
        System.out.println(count);
    }
}