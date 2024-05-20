package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-20
 * Time: 21:28
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1.变成字符串模拟
        String num = in.next();
        int b = Integer.parseInt(num);
        // if(check(b)){
        //     System.out.println("prime");
        //     return;
        // }
        StringBuilder sd = new StringBuilder(num);
        int n = num.length();
        for(int i = n - 2;i >= 0;i--){
            if(num.charAt(i) >= '0' && num.charAt(i) <= '9'){
                sd.append(num.charAt(i));
            }
        }
        num = sd.toString();
        long a = Integer.parseInt(num);
        //2.检查对应的回文串是否是素数
        if(check(a)){
            System.out.println("prime");
        }else{
            System.out.println("noprime");
        }
    }
    public static boolean check(long n){
        if(n < 2){
            return false;
        }
        if(n == 2){
            return true;
        }
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
