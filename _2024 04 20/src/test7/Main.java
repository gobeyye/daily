package test7;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-20
 * Time: 14:54
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(),b = in.nextInt();
        int max = 0;
        for(int i = a;i <= b;i++){
            max = Math.max(max,zhixu(i));
        }
        int count = 0;
        for(int i = a;i <= b;i++){
            if(zhixu(i) == max){
                count++;
            }
        }
        System.out.println(max);
        for(int i = a;i <= b;i++){
            if(zhixu(i) == max){
                count--;
                if(count >= 1){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i);
                }

            }
        }


    }
    public static int zhixu(int n){
        if(n / 10 == 0){
            return 0;
        }
        int count = 0;
        while(n / 10 != 0){
            count++;
            int tmp = 1;
            while(n != 0){
                tmp *= n % 10;
                n /= 10;
            }
            n = tmp;
        }
        return count;

    }
}
