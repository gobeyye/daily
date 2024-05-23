package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-23
 * Time: 22:01
 */

//dfs
import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static int n, m;
    static List<List<Integer>> ret;
    static List<Integer> path;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //使用 dfs
        n = in.nextInt();
        m = in.nextInt();
        ret = new ArrayList<>();
        path = new ArrayList<>();
        dfs(1, 0);
        for (List<Integer> tmp : ret) {
            for (int x : tmp) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    public static void dfs(int start, int sum) {
        if (sum >= m) {
            if (sum == m) {
                ret.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = start; i <= n; i++) {
            //这样就不用 vis 去重了,每次都是递增的
            if (i + sum > m) {//优化
                return;
            }
            path.add(i);
            //不能放在这里优化，因为回溯不了
            dfs(i + 1, sum + i);
            path.remove(path.size() - 1);//回溯
        }
    }

}
