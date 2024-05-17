package test2;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-17
 * Time: 21:20
 */
public class Main {
    public static void main(String[] args) {
        int[][] nums = {{10,11},{10,11},
                {-12,-11},{-12,-11}};
        Arrays.sort(nums, (a, b) ->
        {
            return a[0] <= b[0] ? -1 : 1;
//            return a[0] - b[0];
        });

        for(int i = 0;i < nums.length;i++){
            System.out.println(nums[i][0] + " " + nums[i][1]);
        }
    }

}
