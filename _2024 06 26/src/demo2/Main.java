package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-26
 * Time: 10:20
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n == 0){
            System.out.println(0);
            return;
        }
        //读入数据
        Integer[] nums = new Integer[n];
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        //排序
        Arrays.sort(nums,(o1,o2) -> {
            if(o1 > o2) return 1;
            else if(o1 == o2) return 0;
            else return -1;
        });
        List<List<Integer>> ret = new ArrayList<>();
        for(int i = 0;i < n;i++){
            List<Integer> tmp = null;
            if(ret.size() != 0){
                tmp = ret.get(ret.size() - 1);
            }
            if(tmp != null && nums[i] == tmp.get(tmp.size() - 1) + 1){
                tmp.add(nums[i]);
            }else{
                //二分查照相等的情况，如果有的话，返回下标，没有的话返回 -1
                int index = binary(ret,nums[i]);//使用右模板
                if(index == -1){//为空 或者 找不到的情况下
                    List<Integer> newList = new ArrayList<>();
                    newList.add(nums[i]);//创建新的
                    ret.add(newList);
                }else{
                    ret.get(index).add(nums[i]);
                }
            }
        }
        int ans = 0x3f3f3f3f;
        for(int i = 0;i < ret.size();i++){
            ans = Math.min(ans,ret.get(i).size());
        }
        System.out.println(ans);
    }
    public static int binary(List<List<Integer>> ret,int x){//要使用，右区间模板
        if(ret.size() == 0) return -1;//特判
        int left = 0,right = ret.size() - 1;
        while(right > left){
            int mid = left + (right - left + 1) / 2;
            int midValue = ret.get(mid).get(ret.get(mid).size() - 1) + 1;
            if(midValue <= x) left = mid;
            else right = mid - 1;
        }
        if(ret.get(left).get(ret.get(left).size() - 1) + 1 == x){
            return left;
        }else{
            return -1;
        }
        //注意 ret.size（） == 1 的情况
    }
}
