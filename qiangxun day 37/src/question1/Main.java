package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-27
 * Time: 8:31
 */
import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(solve("youzan", "zanyou"));
    }

    public static boolean solve (String A, String B) {
        // write code here
        int n1 = A.length(), n2 = B.length();
        if (n1 != n2) {
            return false;
        }
        if(A.equals(B)){
            return true;
        }
        StringBuilder sd = new StringBuilder(A);
        for (int i = 0; i < n1 - 1; i++) {
            char tmp = sd.charAt(0);
            sd.deleteCharAt(0);
            sd.append(tmp);
            if (sd.toString().equals(B)) {
                return true;
            }
        }
        return false;

    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 旋转字符串
     * @param A string字符串
     * @param B string字符串
     * @return bool布尔型
     */
//    public boolean solve (String A, String B) {
//        // write code here
//        int len1 = A.length();
//        int len2 = B.length();
//        Random random = new Random();
//        if(len1 != len2){
//            return false;
//        }
//        if(A.equals(B)){
//            return true;
//        }
//        StringBuilder sd = new StringBuilder();
//
//        return random.nextBoolean();
//    }
}
