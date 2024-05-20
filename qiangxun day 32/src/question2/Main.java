package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-20
 * Time: 21:28
 */
import java.util.*;
// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //贪心
        //1.按照 end 排序
        int n = in.nextInt();
        int[][] nums = new int[n][2];
        for(int i = 0;i < n;i++){
            nums[i][0] = in.nextInt();nums[i][1] = in.nextInt();
        }
        Arrays.sort(nums,(o1,o2) -> {
            return o1[1] > o2[1] ? 1 : -1;
        });
        int count = 1;
        //2.if 后面开始大于等于前面的终
        int end = nums[0][1];
        for(int i = 1;i < n;i++){
            if(end <= nums[i][0]){
                count++;
                end = nums[i][1];
            }
        }
        System.out.println(count);
    }
}