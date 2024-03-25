package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-24
 * Time: 21:58
 */
public class Main {
    //蓝桥杯要用静态变量
    public static void main(String[] args) {
        int count = 0;
        for (long i = 2022; i <= 2022222022; i++) {
            if (ishuiwen(i) && isshengxu(i)) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
    public static boolean isshengxu(long n){
        String s = n + "";
        int mid = (s.length() - 1) / 2;
        for(int i = 1;i <= mid;i++){
            if(s.charAt(i) < s.charAt(i - 1)){
                return false;
            }
        }
        return true;
    }
    private static boolean check(long num) {
        String s = num + "";
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) return false;
        }
        return true;
    }


    public static boolean ishuiwen(long n) {
        String s = n + "";
        for (int left = 0, right = s.length() - 1; right > left; right--, left++) {
            if (s.charAt(right) != s.charAt(left)) {
                return false;
            }
        }
        return true;
    }
}
