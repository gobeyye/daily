package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-08
 * Time: 21:18
 */
import java.util.*;
// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),m = in.nextInt();
        //1.创建 List
        List<Integer> ret = new ArrayList<>();
        //2.遍历两个集合
        for(int i = 0;i < n;i++){
            ret.add(in.nextInt());
        }
        for(int i = 0;i < m;i++){
            int tmp = in.nextInt();
            if(!ret.contains(tmp)){
                ret.add(tmp);
            }
        }
        //3.利用sort排序
        Collections.sort(ret);
        for(int i = 0;i < ret.size();i++){
            if(i != ret.size() - 1){
                System.out.print(ret.get(i) + " ");
            }else{
                System.out.print(ret.get(i));
            }
        }
    }
}