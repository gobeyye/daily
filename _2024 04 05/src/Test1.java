import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-05
 * Time: 16:17
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Integer[][] qe = new Integer[m][2];
        Integer[] ans = new Integer[n + 1];
        for(int i = 1;i <= n;i++) {
            ans[i] = i;
        }
        for(int i = 0;i < m;i++) {
            qe[i][0] = in.nextInt();
            qe[i][1] = in.nextInt();
        }
        for(int i = 0;i < m;i++) {
            if(qe[i][0] == 0) {
                //降序
                Arrays.sort(ans,1,qe[i][1] + 1,(o1,o2)->o2 - o1);

            }else {
                //升序
            }
        }
    }
}
