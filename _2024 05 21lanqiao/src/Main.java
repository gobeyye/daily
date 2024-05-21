/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */

import java.math.BigInteger;
import java.util.*;
public class Main {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] numa = new long[n + 1];

        for(int i = 1;i <= n;i++){
            numa[i] = in.nextInt();
        }


            long[] count = new long[3];
            for(int i = 1;i <= 2;i++){
                long[] numb = new long[n + 1];
                for(int j = 1;j <= n;j++){
                    numb[j] = i * j;
                    if(numb[j] % numa[j] == 0){
//                        ret++;
                        count[i]++;
                    }
                }
            }
            long ou = n / 2;
            long ji = n - ou;
            long ans = (ou * count[2]) + (ji * count[1]);
            System.out.println(ans);
            return;


    }
}

