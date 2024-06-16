package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-16
 * Time: 15:45
 */
import java.util.*;
public class demo6 {
    static int[][] vis;
    static List<List<String>> ret;
    static List<String> path;
    static StringBuilder sd;
    static int n = 4;
    public static void main(String[] args) {
//        int n = nn;
        vis = new int[10][10];
        ret = new ArrayList<>();
        path = new ArrayList<>();
        sd = new StringBuilder();
        for(int i = 0;i < n;i++){
            sd.append(".");
        }
        dfs(0);
//        System.out.println();
        System.out.println(ret.size());
//        return ret;
    }
    //都是从 1 开始的
    public static void dfs(int step){
        //出口 return/////////////////////////////////////////
        if(step == n){
            ret.add(new ArrayList<>(path));
            return;//递归出口要 return
            //递归一定要先写出口，一定一定注意
        }
        for(int i = 0;i < n;i++){
            if(vis[step][i] == 0){
                sd.setCharAt(i,'Q');
                setVis(step,i);
                path.add(sd.toString());
                sd.setCharAt(i,'.');//回溯
                dfs(step + 1);
                removeVis(step,i);
                path.remove(path.size() - 1);//回溯
            }
        }
    }
    // setVis(step,i);removeVis(step,i);
    public static void removeVis(int x,int y){
        for(int i = 0;i < n;i++){//列
            vis[i][y]--;
            vis[x][i]--;
        }
        vis[x][y]++;
        //负斜线
        for(int i = 1;i < n;i++){
            if(x - i < 0 || y + i >= n){
                break;
            }else{
                vis[x - i][y + i]--;
            }
        }
        for(int i = 1;i < n;i++){
            if(x + i >= n || y - i < 0){
                break;
            }else{
                vis[x + i][y - i]--;
            }
        }
        for(int i = 1;i < n;i++){
            if(x - i < 0 || y - i < 0){
                break;
            }else{
                vis[x - i][y - i]--;
            }
        }
        for(int i = 1;i < n;i++){
            if(x + i >= n || y + i >= n){
                break;
            }else{
                vis[x + i][y + i]--;
            }
        }
    }
    public static void setVis(int x,int y){
        // Arrays.fill(vis[x],true);//行
        for(int i = 0;i < n;i++){//列
            vis[i][y]++;
            vis[x][i]++;
        }
        vis[x][y]--;
        //负斜线
        for(int i = 1;i < n;i++){
            if(x - i < 0 || y + i >= n){
                break;
            }else{
                vis[x - i][y + i]++;
            }
        }
        for(int i = 1;i < n;i++){
            if(x + i >= n || y - i < 0){
                break;
            }else{
                vis[x + i][y - i]++;
            }
        }
        for(int i = 1;i < n;i++){
            if(x - i < 0 || y - i < 0){
                break;
            }else{
                vis[x - i][y - i]++;
            }
        }
        for(int i = 1;i < n;i++){
            if(x + i >= n || y + i >= n){
                break;
            }else{
                vis[x + i][y + i]++;
            }
        }
    }
}
