package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-27
 * Time: 10:08
 */
import java.util.*;
import java.math.*;
public class Main{
    public static String add(String a,String b){
        //逆置,加转成整数数组
        int lenA = a.length();
        int lenB = b.length();
        int lenAll = lenA + lenB;
        int[] p1 = new int[lenAll];
        int[] p2 = new int[lenAll];
        for(int i = 0;i < lenA;i++) p1[i] = a.charAt(lenA - i - 1) - '0';////这里一定要注意，不是从后向前就是逆置
        for(int i = 0;i < lenB;i++) p2[i] = b.charAt(lenB - i - 1) - '0';
        //求和
        int[] sum = new int[lenAll];
        int cd = 0;
        //进位
        for(int i = 0;i < lenAll;i++){
            int tmp = p1[i] + p2[i] + cd;
            cd = tmp / 10;
            sum[i] = tmp % 10;
        }
        int k = lenAll - 1;
        while(k > 0 && sum[k] == 0) k--;//去除前导零，注意 0 的情况
        StringBuilder sd = new StringBuilder();
        for(;k >= 0;k--){//逆置返回
            sd.append(sum[k]);
        }
        return sd.toString();
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.next();String b = in.next();
        String ans = add(a,b);
        System.out.println(ans);
    }
}
