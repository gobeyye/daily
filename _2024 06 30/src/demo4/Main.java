package demo4;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-30
 * Time: 18:38
 */
public class Main {
    static int n;
    static boolean[] vis;
    static double[][] nums;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        nums = new double[n][2];
        vis = new boolean[n];
        for(int i = 0;i < n;i++){
            nums[i][0] = in.nextDouble();nums[i][1] = in.nextDouble();
        }
        double sum = 0;//存储最后的最短总路径
        double sr = 0,sc = 0;
        for(int i = 0;i < n;i++){
//            sum += search(sr,sc);//找到最小点
            int index = search(sr,sc);
            sum += disc(sr,sc,nums[index][0],nums[index][1]);
            sr = nums[index][0];sc = nums[index][1];
        }
        System.out.printf("%.2f",sum);
    }

    private static int search(double sr, double sc) {
        double min = 0x3f3f3f3f;//存储最小路径
        int index = -1;
        for(int i = 0;i < n;i++){
            if(!vis[i] && min > disc(sr,sc,nums[i][0],nums[i][1])){
                min = disc(sr,sc,nums[i][0],nums[i][1]);
                index = i;
            }
        }
        vis[index] = true;
        return index;
    }

    private static double disc(double sr, double sc, double v, double v1) {
        double x1 = (v - sr) * (v -sr);
        double x2 = (v1 - sc) * (v1 - sc);
        return Math.sqrt(x1 + x2);
    }
}
