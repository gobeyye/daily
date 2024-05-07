package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-07
 * Time: 21:21
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextInt(),h = in.nextInt(),b = in.nextInt(),k = in.nextInt();
        long li = (h / b);
        if(h % b != 0){
            li++;
        }
        long guan = (k / a);
        if(k % a != 0){
            guan++;
        }
        long ciShu = Math.min(guan,li);
        long ans = (a + b) * ciShu;
        if(guan > li){
            ans += 10 * b;
        }else if(guan < li){
            ans += 10 * a;
        }
        System.out.println(ans);
    }
}
