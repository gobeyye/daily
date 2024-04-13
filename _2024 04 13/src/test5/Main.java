package test5;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-13
 * Time: 14:05
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums=  new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        int k = in.nextInt();
        while(k > 0){
            boolean ans = false;
            boolean key = true;
            int[] peo = new int[n];
            for(int i = 0;i < n;i++){
                peo[i] = in.nextInt();
            }
            for(int i = 0;i < n;i++){
                if(peo[i] == 0){
                    continue;
                }
                if(peo[i] != nums[i]){
                    key = false;
                }
                if(peo[i] != 0){
                    ans = true;
                }
            }
            if(ans == true && key == true){
                System.out.println("Da Jiang!!!");
            }else{
                System.out.println("Ai Ya");
            }



            k--;
        }
    }
}
