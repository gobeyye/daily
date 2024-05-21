package question6;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-21
 * Time: 23:03
 */









import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] numa = new long[n + 1];

        for(int i = 1;i <= n;i++){
            numa[i] = in.nextInt();
        }
            long ret = 0;
            //1暴力
            for(int i = 1;i <= n;i++){
                long[] numb = new long[n + 1];
                for(int j = 1;j <= n;j++){
                    numb[j] = i * j;
                    if(numb[j] % numa[j] == 0){
                        ret++;
                    }
                }
            }
            System.out.println(ret);
            return;
    }
}
