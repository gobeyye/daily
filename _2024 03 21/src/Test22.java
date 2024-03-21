/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-21
 * Time: 21:27
 */
public class Test22 {
    static boolean[] vis;
    static int[] path;
    static int count;

    public static void main(String[] args) {
        System.out.println(countArrangement(2));
    }
    public static int countArrangement(int n) {
        vis = new boolean[n + 1];
        path = new int[n + 1];
        dfs(n,1);
        return count;
    }
    public static void dfs(int n,int step){
        if(step == n + 1){
            if(panduan(path,n)){
                count++;
            }
            return;
        }
        for(int i = 1;i <= n;i++){
            if(!vis[i]){
                vis[i] = true;
                path[step] = i;
                dfs(n,step + 1);
                vis[i] = false;
                path[step] = 0;
            }
        }
    }
    public static boolean panduan(int[] nums,int n){
        boolean key1 = true;
        boolean key2 = true;
        for(int i = 1;i <= n;i++){
            if(nums[i] % i != 0){
                key1 = false;
            }
            if(i % nums[i] != 0){
                key2 = false;
            }
            if(key1 == false && key2 == false){
                break;
            }
        }
        return key1 || key2;
    }
}
