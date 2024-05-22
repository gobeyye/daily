package question6;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-21
 * Time: 23:03
 */



//









//暴力非正规解法
/*import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] numa = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            numa[i] = in.nextInt();
        }
        long ret = 0;
        //1暴力
        for (int i = 1; i <= n; i++) {
            long[] numb = new long[n + 1];
            for (int j = 1; j <= n; j++) {
                numb[j] = i * j;
                if (numb[j] % numa[j] == 0) {
                    ret++;
                }
            }
        }

        System.out.println(ret);
        return;
    }
}*/




//正解，数学
import java.util.*;
public class Main{
    public static int gcd(int a,int b){
        return b != 0 ? gcd(b,a % b) : a;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //1.遍历 数组
        //2.逐个求 加 到ret上
        int[] a = new int[n];
        int[] c = new int[n];
        long ret = 0;//最终的结果
        for(int i = 0;i < n;i++){
            a[i] = in.nextInt();
            c[i] = i + 1;
            ret += n / (a[i] / gcd(a[i],c[i]));
        }
        System.out.println(ret);
    }
}
