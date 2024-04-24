package test5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-24
 * Time: 21:30
 */
import java.util.Scanner;
import java.util.*;
// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static int[] path;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0;i < t;i++){
            int[] nums = new int[6];
            for(int j = 0; j < 6;j++){
                nums[j] = in.nextInt();
            }
            path = new int[3];
            boolean key = false;
            for(int j = 0;j < 3;j++){
                key = dfs(nums,0,j);
                if(key == true){
                    break;
                }
            }
            if(key == true){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
    public static boolean dfs(int[] nums,int step,int star){
        if(step == 3){
            boolean key1 = isSanJiao(nums[path[0]],nums[path[1]],nums[path[2]]);
            if(key1 == false){
                return false;
            }
            int[] array = new int[3];
            int j = 0;
            for(int i = 0;i < 6;i++){
                if(i == path[0] || i == path[1] || i == path[2]){
                    continue;
                }
                array[j++] = nums[i];
            }
            boolean key2 = isSanJiao(array[0],array[1],array[2]);
            if(key2 == true){
                return true;
            }else{
                return false;
            }
        }
        for(int i = star;i < 6;i++){
            path[step] = i;
            if(dfs(nums,step + 1,i + 1) == true){
                return true;
            }
        }
        return false;
    }
    public static boolean isSanJiao(int a,int b,int c){
        int[] nums = {a,b,c};
        Arrays.sort(nums);
        return (long)nums[0] + (long)nums[1] > (long)nums[2];
    }
}

