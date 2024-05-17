package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-17
 * Time: 20:15
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            long a = in.nextLong(),b = in.nextLong();
            if(check(a * b)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
    public static boolean check(long n){
        if(n < 2){
            return false;
        }
        if(n == 2){
            return true;
        }
        for(long i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
