package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-21
 * Time: 8:16
 */
public class Main2 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        change(num);
        for(int x:num){
            System.out.println(x);
        }
    }
    public static void change(int[] nums){
        nums[0] = 100;
    }
}
