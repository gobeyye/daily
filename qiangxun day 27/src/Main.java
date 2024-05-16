import test1.A;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[][] nums = {{3,3},{3,3},{3,3},{-1,-1},{-1,-1},{-1,-1}};
        Arrays.sort(nums,(a,b) -> {
            return a[0] - b[0];
//             return a[0] <= b[0] ? -1 : 1;
        });

        for(int i = 0;i < 6;i++){

            System.out.println(nums[i][0] + " " + nums[i][1]);

        }



    }
}