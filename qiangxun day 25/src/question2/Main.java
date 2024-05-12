package question2;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-12
 * Time: 20:57
 */
public class Main {
    public static void main(String[] args) {
        int[][] nums = {{0,10},{10,20},{20,30}};
//        System.out.println(hostschedule(nums));
    }
//    public boolean hostschedule (int[][] nums) {
//        // write code here
//        //1.按照第二个元素排序
//        int n = nums.length;
//        Integer[][] schedule = new Integer[n][2];
//        for(int i = 0;i < n;i++){
//            schedule[i][0] = nums[i][0];
//            schedule[i][1] = nums[i][1];
//        }
//
//        Arrays.sort(schedule,(o1,o2)->{
//            return o1[1] - o2[1];
//        });
//
//        //2.判断后一个的start是否大于前一个的end，如果小于就返回false
//        for(int i = 1;i < n;i++){
//            if(schedule[i][0] > schedule[i - 1][1]){
//                return false;
//            }
//        }
//        //3.返回
//        return true;
//    }
    public static boolean hostschedule (int[][] schedule) {
        // write code here
        //1.按照第二个元素排序
        Arrays.sort(schedule,(o1,o2)->{
            return o1[1] - o2[1];
        });
        int n = schedule.length;
        //2.判断后一个的start是否大于前一个的end，如果小于就返回false
        for(int i = 1;i < n;i++){
            if(schedule[i][0] > schedule[i - 1][1]){
                return false;
            }
        }
        //3.返回
        return true;
    }
}
