package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-10
 * Time: 20:56
 */
//解法1：带改正
//import java.util.Scanner;
//
//// 注意类名必须为 Main, 不要有任何 package xxx 信息
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        while(t > 0){
//            int h = in.nextInt(),a = in.nextInt(),H = in.nextInt(),A = in.nextInt();
//            int ci = (H - a) / a;
//            if(ci == 0){
//                System.out.println(-1);
//            }else{
//                h--;
//                if(h == 0){
//                    System.out.println(0);
//                }else{
//                    System.out.println(h / (ci * A));
//                }
//            }
//            t--;
//        }
//    }
//}


//解法：正确
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int h = in.nextInt(),a = in.nextInt(),H = in.nextInt(),A = in.nextInt();
            if(a >= H){
                System.out.println(-1);
            }else{
                //至少我被打一次
                int ci = (H - a) / a;
                if((H - a) % a != 0){
                    ci++;
                }
                h--;
                if(h == 0){
                    System.out.println(0);
                }else{
                    System.out.println(h / (ci * A));
                }
            }
            t--;
        }
    }
}