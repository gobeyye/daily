package demo1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-30
 * Time: 9:02
 */
public class Main {
    static int n,a,b;
    static int ret = -1;
    static int[] nums;
    static boolean[] vis;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //读入数据
        n = in.nextInt();a = in.nextInt();b = in.nextInt();
        vis = new boolean[n + 1];
        nums = new int[n + 1];
        for(int i = 1;i <= n;i++){
            nums[i] = in.nextInt();
        }
        bfs(a);
        System.out.println(ret);
    }
    public static void bfs(int src){
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int size = q.size();
            ret++;
            for(int i = 0;i < size;i++){
                int tmp = q.poll();
                vis[tmp] = true;
                if(tmp == b){
                    return;
                }
                int x = tmp + nums[tmp];//上楼梯
                int y = tmp - nums[tmp];//下楼梯
                if(check(x) && !vis[x]){
                    q.add(x);
                    vis[x] = true;//剪枝
                }
                //如果是 if 和 else if 的话，只能执行一个
                if(check(y) && !vis[y]){
                    q.add(y);
                    vis[y] = true;
                }
            }
        }
        ret = -1;
    }
    private static boolean check(int y) {
        return y >= 1 && y <= n;
    }
}



//
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
///**
// * Created with IntelliJ IDEA.
// * Description:
// * User: HXL
// * Date: 2024-06-30
// * Time: 9:02
// */
//public class Main {
//    static int n,a,b;
//    static int ret = -1;
//    static int[] nums;
//    static boolean[] vis;
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        //读入数据
//        n = in.nextInt();a = in.nextInt();b = in.nextInt();
//        vis = new boolean[n + 1];
//        nums = new int[n + 1];
//        for(int i = 1;i <= n;i++){
//            nums[i] = in.nextInt();
//        }
//        bfs(a);
//        System.out.println(ret);
//    }
//    public static void bfs(int src){
//        Queue<Integer> q = new LinkedList<>();
//        q.add(src);
//        while(!q.isEmpty()){
//            int size = q.size();
//            ret++;
//            for(int i = 0;i < size;i++){
//                int tmp = q.poll();
//                vis[tmp] = true;
//                if(tmp == b){
//                    return;
//                }
//                int x = tmp + nums[tmp];//上楼梯
//                int y = tmp - nums[tmp];//下楼梯
//                if(check(x)){
//                    q.add(x);
//                }else if(check(y)){
//                    q.add(y);
//                }
//            }
//        }
//    }
//    private static boolean check(int y) {
//        return y >= 1 && y <= n;
//    }
//}

