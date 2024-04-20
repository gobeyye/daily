package test6;



/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-20
 * Time: 14:43
 */










import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] nums = new double[n + 1];
        for(int i = 1;i <= n;i++){
            nums[i] = in.nextDouble();
        }
        double sum = 0;
        int[] hash = new int[n + 1];
        while(true){
            int x = in.nextInt();//品种
            int y = in.nextInt();//完数
            hash[x] += y;
            if(x == 0){
                break;
            }
            double tmp = nums[x] * y;
            sum += tmp;
        }
        for(int i = 1;i <= n;i++){
            System.out.println(hash[i]);
        }
        System.out.printf("%.2f",sum);
    }
}
