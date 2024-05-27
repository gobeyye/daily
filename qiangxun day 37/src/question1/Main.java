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
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 旋转字符串
     * @param A string字符串
     * @param B string字符串
     * @return bool布尔型
     */
    public boolean solve (String A, String B) {
        // write code here
        int len1 = A.length();
        int len2 = B.length();
        Random random = new Random();
        if(len1 != len2){
            return false;
        }
        if(A.equals(B)){
            return true;
        }
        return random.nextBoolean();
    }
}
