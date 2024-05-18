package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-18
 * Time: 10:40
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {1,4,7,4,6};
        int ans = LIS(nums);
        System.out.println(ans);
    }
    public static int LIS (int[] a) {
        // write code here
        int n = a.length;
        int[] dp = new int[n + 1];//对应长度的最小值
        int pos = 0;//记录最大长度的长度
        for(int x:a){
            if(pos == 0 || x > dp[pos]){
                dp[++pos] = x;//长度为0的情况和x大于最大值的情况
            }else{
                //二分查找
//                 int l = 1,r = pos;
//                 while(r > l){
//                     //查找左端点
//                     //试试查找右端点
//                     int mid = l + (r - l) / 2;
//                     if(x <= dp[mid]){
//                         r = mid;
//                     }else{
//                         l = mid + 1;
//                     }
//                 }
//                 dp[l] = x;
                int l = 1,r = pos;
                while(r > l){
                    int mid = l + (r - l + 1) / 2;
                    if(dp[mid] <= x){
                        l = mid;
                    }else{
                        r = mid - 1;
                    }
                }
                dp[l] = x;
            }
        }
        return pos;
    }
}
