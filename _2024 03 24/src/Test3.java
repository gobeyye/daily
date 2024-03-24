import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-24
 * Time: 15:16
 */
public class Test3 {
    public static void main(String[] args) {
        solveNQueens(4);
    }
    static List<List<String>> ret;
    static List<String> path;
    static boolean[][] vis;
    static StringBuilder sbd;
    public static List<List<String>> solveNQueens(int n) {
        ret = new ArrayList<>();
        path = new ArrayList<>();
        sbd= new StringBuilder();
        for(int i = 0;i < n;i++){
            sbd.append('.');
        }
        vis = new boolean[n][n];
        dfs(n,0);
        return ret;
    }
    public static void dfs(int n,int step){
        if(step == n){
            ret.add(new ArrayList<String>(path));
            return;
        }
        for(int i = 0;i < n;i++){
            if(!vis[step][i]){
                sbd.setCharAt(i,'Q');
                String tmp = sbd.toString();
                sbd.setCharAt(i,'.');
                path.add(tmp);
                for(int x = 0;x < n;x++){
                    vis[x][i] = true;
                }
                for(int j = step,k = i;j < n && k < n;j++,k++){
                    vis[j][k] = true;
                }
                for(int j = step,k = i;j < n && k >= 0;j++,k--){
                    vis[j][k] = true;
                }
                dfs(n,step + 1);
                path.remove(path.size() - 1);
                for(int x = 0;x < n;x++){
                    vis[x][i] = false;
                }
                for(int j = step;j < n;j++){
                    for(int k = i;k < n;k++){
                        vis[j][k] = false;
                    }
                    for(int h = i;h >= 0;h--){
                        vis[j][h] = false;
                    }
                }
            }
        }
    }
}
