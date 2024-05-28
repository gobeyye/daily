package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-28
 * Time: 20:11
 */
import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1.创建 哈希表
        int[] hash = new int[26];
        int max = 0;
        while(in.hasNext()){
            String s = in.next();
            int n = s.length();
            for(int i = 0;i < n;i++){
                if(s.charAt(i) != ' '){
                    hash[s.charAt(i) - 'a']++;
                    max = Math.max(max,hash[s.charAt(i) - 'a']);
                }
            }
        }
        //2.找出最多的
        for(int i = 0;i < 26;i++){
            if(hash[i] == max){
                System.out.println((char)(i + 'a'));
            }
        }
    }
}
