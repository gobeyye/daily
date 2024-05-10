package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-10
 * Time: 21:07
 */
import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] sss = new String[n];
        for(int i = 0; i < n;i++){
            sss[i] = in.next();
        }
        char[][] arr = new char[n][];
        for(int i = 0;i < n;i++){

            arr[i] = sss[i].toCharArray();
            //1.排序
            Arrays.sort(arr[i]);
            sss[i] = new String(arr[i]);
        }
        Set<String> set = new HashSet<>();
        //2.选取第一个比较，不等就进入set
        set.add(sss[0]);
        for(int i = 1;i < n;i++){
            if(!set.contains(sss[i])){//这步没有必要，因为set是天然去重的
                set.add(sss[i]);
            }
        }
        //3.最后返回set的元素个数即可
        int ans = set.size();
        System.out.println(ans);
    }
}