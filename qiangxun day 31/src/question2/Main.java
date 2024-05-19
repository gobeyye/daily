package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-19
 * Time: 21:36
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T > 0){
            int n = in.nextInt(),a = in.nextInt(),b = in.nextInt();
            int a1 = a / 2,b1 = b / 3;//a1 表示平均坐一个人需要多少钱
            if(a1 >= b1){
                long count = (n / 3) * b;
                if(n % 3 != 0){
                    if(a >= b){
                        count += b;
                    }else{
                        count += a;
                    }
                }
                System.out.println(count);
            }else{
                long count = (n / 2) * a;
                if(n % 2 != 0){
                    count += a;
                }
                System.out.println(count);
            }
            T--;
        }
    }
}