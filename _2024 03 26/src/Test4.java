import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        Integer[] nums = {1,7,4,2,9,6,4};
        Arrays.sort(nums,(o1,o2)-> o2 - o1);
        for(int i = 0;i < nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
