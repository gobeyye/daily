///**
// * Created with IntelliJ IDEA.
// * Description:
// * User: ${USER}
// * Date: ${YEAR}-${MONTH}-${DAY}
// * Time: ${TIME}
// */
//public class Main {
//    static int[] path;
//    static boolean[] vis;
//    public static void dfs(int n,int step){
//        if(step == n + 1){
//            for(int i = 1;i <= n;i++){
//                System.out.print(path[i] + " ");
//            }
//            System.out.println();
//            return;//忘记ruturn了
//        }
//        for(int i = 1;i <= n;i++){//一旦不满足马上退出
//            if(vis[i] == true){
//                continue;
//            }
//            path[step] = i;
//            vis[i] = true;
//            dfs(n,step + 1);
//            path[step] = 0;//回溯
//            vis[i] = false;
//        }
//    }
//    public static void main(String[] args) {
//        path = new int[5];
//        vis = new boolean[5];
//        dfs(4,1);
//
////        System.out.println("Hello world!");
//    }
//}