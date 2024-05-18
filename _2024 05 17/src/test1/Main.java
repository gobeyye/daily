package test1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-17
 * Time: 19:30*/


public class Main {
    public static void main(String[] args) {
        int[][] nums = {{2147483646,2147483647},{2147483646,2147483647},
                {-2147483648,-2147483647},{-2147483648,-2147483647}};
        //按照数组的第一个数排序
        Arrays.sort(nums, (a, b) ->
        {
//          return a[0] <= b[0] ? -1 : 1;/////1
            return a[0] - b[0];///////2
        });
        for(int i = 0;i < nums.length;i++){
            System.out.println(nums[i][0] + " " + nums[i][1]);
        }
    }
}
