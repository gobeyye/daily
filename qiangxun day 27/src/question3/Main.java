package question3;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-14
 * Time: 21:47
 */
public class Main{
    //为什么这个贪心是错误的
    public int minmumNumberOfHost (int n, int[][] startEnd) {
        // write code here
        //1.按照end排序
        Arrays.sort(startEnd,(o1, o2) -> {
            return o1[1] - o2[1];
        });
        int max = 0;
        int path = 0;
        //2.计算从 i 开始以后，有多少个 start 比 end 小，找到最大值
        for(int i = 0;i < n;i++){
            path = 1;
            for(int j = i + 1;j < n;j++){
                if(startEnd[j][0] < startEnd[i][1]){
                    path++;
                }
            }
            max = Math.max(max,path);
        }
        return max;
    }
    public static void main(String[] args) {

    }
}
