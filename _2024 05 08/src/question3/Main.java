package question3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-08
 * Time: 19:29
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            //1.创建并统计哈希表
            boolean[][] hash = new boolean[n][26];
            for(int i = 0;i < n;i++){
                char[] s = in.next().toCharArray();
                for(char ch:s){
                    hash[i][ch - 'a'] = true;
                }
            }
            //2.比较对应位置哈希表是否存在字符相同
            int left = 0,right = n - 1;
            boolean key = true;
            while(left + 1 <= right){
                key = false;
                for(int k = 0;k < 26;k++){
                    if(hash[left][k] == hash[right][k]){
                        key = true;
                        break;
                    }
                }
                if(key == false){
                    System.out.println("No");
                    break;
                }
                right--;
                left++;
            }
            if(key == true){
                System.out.println("Yes");
            }
            t--;
        }
    }
}