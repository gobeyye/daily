package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-21
 * Time: 21:01
 */
import java.util.*;


public class Main {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param str string字符串
     * @return string字符串ArrayList
     */
    ArrayList<String> ret;//返回的结果
    StringBuilder path;
    int n;
    boolean[] vis;
    Set<String> hash;
    public ArrayList<String> Permutation (String str) {
        // write code here
        path = new StringBuilder();
        char[] s = str.toCharArray();
        n = s.length;
        vis = new boolean[n];
        ret = new ArrayList<>();
        hash = new HashSet<>();
        dfs(s,0);
        return ret;
    }
    public void dfs(char[] s,int step){
        if(step == n){
            String tmp = path.toString();
            if(!hash.contains(tmp)){
                hash.add(tmp);
                ret.add(path.toString());
            }
            return;
        }
        for(int i = 0;i < n;i++){
            if(!vis[i]){
                path.append(s[i]);
                vis[i] = true;
                dfs(s,step + 1);
                vis[i] = false;
                path.deleteCharAt(path.length() - 1);//回溯
            }
        }

    }
}
