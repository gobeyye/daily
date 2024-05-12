package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-12
 * Time: 20:39
 */
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ss = in.next();
        char[] s = ss.toLowerCase().toCharArray();
        int n = s.length;
        if(n == 0){//处理边界情况
            System.out.println("No Answer");
            System.out.println("0");
            return;
        }
        int[] hash = new int[26];
        //1.遍历字符串
        for(int i = 0;i < n;i++){
            hash[s[i] - 'a']++;
        }
        //2.hash表统计
        int max = 0,min = 101;

        //3.找到最大和最小
        for(int i = 0;i < 26;i++){
            max = Math.max(max,hash[i]);
            if(hash[i] != 0){//存在才行，0说明这个字符不存在所以不能参与运算
                min = Math.min(min,hash[i]);
            }
        }
        //4.判断输出
        if(zhishu(max - min)){
            System.out.println("Lucky Word");
            System.out.println(max - min);
        }else{
            System.out.println("No Answer");
            System.out.println("0");
        }
    }
    public static boolean zhishu(int n){
        if(n <= 1){
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