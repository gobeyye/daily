import java.util.Arrays;
public class Test5 {
    public static void main(String[] args) {
        int[][] nums = {{1,3},{2,7},{6,7},{4,1},{3,9}};
        Arrays.sort(nums,(o1,o2)->o1[0] - o2[0]);
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums[i].length;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
