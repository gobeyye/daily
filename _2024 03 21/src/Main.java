/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
import java.util.*;
public class Main {
    public int totalFruit1(int[] fruits) {
        int n = fruits.length;
        int[] hash = new int[n + 1];
        int len = 0;
        for(int left = 0,right = 0, kinds = 0;right < n;right++){
            int in = fruits[right];
            if(hash[in] == 0){
                kinds++;
            }
            hash[in]++;
            if(kinds > 2){
                int out = fruits[left++];
                hash[out]--;
                if(hash[out] == 0){
                    kinds--;
                }
            }
            len = Math.max(len,right - left + 1);
        }
        return len;
    }

    public static int totalFruit(int[] fruits) {
        int[] vis = new int[2];
        int n = fruits.length;
        int count = 0;
        int ans = 0;
        vis[0] = vis[1] = -1;
        for(int left = 0,right = 0;right < n;right++){
            if(fruits[right] != vis[0] && fruits[right] != vis[1]){
                count++;
                if(count == 1){
                    vis[0] = fruits[right];
                }else if(count == 2){
                    vis[1] = fruits[right];
                }
            }
            if(count > 2){
                while(vis[0] == fruits[left]){
                    left++;
                }
                count--;
                vis[0] = vis[1];
                vis[1] = fruits[right];
            }
            ans = Math.max(ans,right - left + 1);
        }
        return ans;

    }
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,10);
        System.out.println(map.get(1));
        System.out.println();
    }
}