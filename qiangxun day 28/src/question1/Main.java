package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-15
 * Time: 20:38
 */
import java.util.Scanner;
//数学 + 模拟
// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        while(q > 0){
            int x = in.nextInt();
            if(x % 2 == 0){
                System.out.println(x);
            }else{
                String s = "" + x;
                char[] tmp = s.toCharArray();//最后一个数一定不是偶数
                int n = tmp.length;
                int[] nums = new int[n];
                boolean key = false;
                int index = 0;
                for(int i = 0;i < n;i++){
                    nums[i] = (int)(tmp[i] - '0');
                    if(nums[i] % 2 == 0){
                        index = i;
                        key = true;
                    }
                }
                if(key == false){//数位中没有偶数情况
                    System.out.println(-1);
                }else{
                    //最后一个不是，且第一个不是0
                    //交换即可
                    int a = nums[index];
                    nums[index] = nums[n - 1];
                    nums[n - 1] = a;
                    //重写变成数字
                    int d = 0;
                    for(int j = 0;j < n;j++){
                        d = d * 10 + nums[j];
                    }
                    System.out.println(d);
                }
            }
            q--;
        }
    }
}
