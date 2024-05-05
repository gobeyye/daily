package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-05
 * Time: 19:03
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
/*
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = "" + n;
        if(s.length() == 0){
            System.out.println(0);
            return;
        }
        int[] nums = new int[s.length()];
        for(int i = 0;i < s.length();i++){
            nums[i] = s.charAt(i) - '0';
        }
        StringBuilder sd = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            if(nums[i] % 2 == 0){
                sd.append(0);
            }else{
                sd.append(1);
            }
        }
        String sss = new String(sd);///////////
        int ans = Integer.parseInt(sss);
        System.out.println(ans);
    }
}*/
public class Main{
    public static void main(String[] args) {
        StringBuilder sd = new StringBuilder();
        sd.append('a');
        sd.append('a');
        sd.append('b');
//        sd.append(5);
        String ans = new String(sd);
        System.out.println(ans);
        String ans2 = sd.toString();
        System.out.println(ans2);
//        int a = Integer.parseInt(ans);//自动过滤前导零
//        System.out.println(a);
    }
}