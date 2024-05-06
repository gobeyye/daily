package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-06
 * Time: 20:51
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static String[] ss;
    static int n;
    static StringBuilder path;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            n = in.nextInt();
            path = new StringBuilder();
            ss = new String[n];
            for(int i = 0;i < n;i++){
                ss[i] = in.next();
            }
            if(dfs(0) == true){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            t--;
        }
    }
    public static boolean ishuiwen(String s){
        int left = 0;
        int right = s.length() - 1;
        while(right > left + 1){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public static boolean dfs(int step){
        if(step == n){
            String tmp = path.toString();
            return ishuiwen(tmp);
        }
        for(int i = 0;i < ss[step].length();i++){
            path.append(ss[step].charAt(i));
            if(dfs(step + 1) == true){
                return true;
            }
            path.deleteCharAt(ss[step].length() - 1);
        }
        return false;
    }
}