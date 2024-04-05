import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    static long ret;
    static long n = 4000;
    public static void main(String[] args) {
        dfs(0,1);
        System.out.println(ret);
        System.out.println("hehe");
    }
    public static void dfs(int path,long sum) {
        if(path == 3) {
            if(sum == n) {
                ret++;
            }
            return;
        }
        if(sum > n) {
            return;
        }
        for(long i = 1;i <= n;i++) {
            dfs(path + 1,sum * i);
        }
    }

}