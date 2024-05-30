package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-30
 * Time: 16:35
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1.遍历 26 个字母
        char[] s = in.next().toLowerCase().toCharArray();
        int n = s.length;
        if(n == 0){
            System.out.println(0);
            return;
        }
        long ret = 0x3f3f3f3f;
        long path = 0;
        for(char i = 'a';i <= 'z';i++){
            path = 0;
            for(int j = 0;j < n;j++){
                //2.遍历整个字符串
//                path += Math.min(Math.abs(i - s[j]),i - 26 + s[j]);
                path += Math.min(Math.abs(i - s[j]),26 - Math.abs(i - s[j]));
//                path += Math.min(Math.abs(i - s[j]),26 - Math.abs(i  - s[j]));
            }

            ret = Math.min(ret,path);
        }
        if(ret == 0x3f3f3f3f){
            System.out.println(0);
            return;
        }
        System.out.println(ret);
    }
}
