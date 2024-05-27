package question9;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-27
 * Time: 9:28
 */




import java.util.*;
public class Main {
    public static void main(String[] args) {
        Integer[] nums = {3,5,2,7,3};
        Arrays.sort(nums,(o1,o2) -> {
            return o1 - o2;
        });
        for(int x:nums){
            System.out.print(x + " ");
        }

    }
}
