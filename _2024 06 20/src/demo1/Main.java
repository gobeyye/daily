package demo1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-20
 * Time: 10:59
 */
public class Main {
    public static void main(String[] args) {
        int[][] nums = {{21474, 214748}, {21474, 214748},
                {-214748, -214748}, {-214748, -214748}};
        //按照数组的第一个数排序
        Arrays.sort(nums, (a, b) ->
        {
            if (a[0] > b[0]) {
                return 1;
            } else if (a[0] == b[0]) {
                return 0;
            } else {
                return -1;
            }

        });
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i][0] + " " + nums[i][1]);
        }
    }
}