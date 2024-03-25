package question4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-24
 * Time: 22:27
 */
/*import java.util.Scanner;
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
}*/




import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n], tmp = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            tmp[i] = a[i];
        }
        Arrays.sort(tmp);
        int mid = tmp[n / 2];
        int bg_cnt = 0, sml_cnt = 0; // 记录比mid大的和比mid小的数
        for (int i = 0; i < n; i++)
            if (a[i] < mid) sml_cnt ++;
            else if (a[i] > mid) bg_cnt ++;

        if (bg_cnt < sml_cnt) {
            for (int i = 0; i < n; i++)
                if (a[i] < mid) System.out.print(mid - a[i] + " ");
                else System.out.print(0 + " ");
        } else if (bg_cnt == sml_cnt){
            for (int i = 0; i < n; i++)
                if (a[i] < mid) System.out.print(mid - a[i] + 1 + " ");
                else System.out.print(0 + " ");
        }else {
            for (int i = 0; i < n; i++)
                if (a[i] <= mid) System.out.print(mid - a[i] + 1 + " ");
                else System.out.print(0 + " ");
        }
    }
}
