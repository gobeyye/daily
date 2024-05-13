package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-13
 * Time: 19:54
 */
import java.util.*;
import java.io.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static Read in = new Read();
    public static void main(String[] args)throws IOException {
        int n = in.nextInt(),p = in.nextInt();
        int minLeft = 0,maxRight = 0;
        //1.输入值保存最大和最小值
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        minLeft = nums[0];
        maxRight = nums[n - 1];
        //2.枚举温度，二分优化
        int ansMax = 0;
        for(int i = minLeft;i <= maxRight;i++){
            // int tmp = search(nums,i);
            // if(ansMax < tmp){
            //     ansMax = tmp;
            // }
        }
        System.out.println(ansMax);

    }
}
class Read{
    StringTokenizer st = new StringTokenizer("");
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public String next()throws IOException{
        while(!st.hasMoreTokens()){
            st = new StringTokenizer(bf.readLine());
        }
        return st.nextToken();
    }
    String nextLine() throws IOException{
        return bf.readLine();
    }
    int nextInt() throws IOException{
        return Integer.parseInt(next());
    }
}
