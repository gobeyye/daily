import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static int count = 0;
    static int n;
    static int[] path;
    static int[] question;
    static boolean[] vis;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1.用dfs列出所有的排列结果
        //数组全部向后移动一位
        n = in.nextInt();
        path = new int[n + 1];
        question = new int[n + 1];
        vis = new boolean[n + 1];
        for(int i = 1;i <= n;i++){
            question[i] = in.nextInt();
        }
        dfs(n,1);
        System.out.println(count);

        //2.用 count 统计个数

    }
    public static void dfs(int n,int step){//没有问题
        if(step == n + 1){
            if(check()){
                count++;
            }
        }
        for(int i = 1;i <= n;i++){
            if(vis[i] == true){
                continue;
            }
            path[step] = i;
            vis[i] = true;
            dfs(n,step + 1);
            path[step] = 0;//回溯
            vis[i] = false;
        }
    }
    public static boolean check(){
        for(int i = 1;i <= n;i++){
            if(question[i] == i){
                continue;
            }else{
                for(int j = 1;j <= n;j++){
                    if(path[j] == i){
                        break;//只能代表这个人是可以了,不代表所有人都可以
                    }
                    if(path[j] == question[i]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

















// //调试
// import java.util.Scanner;

// // 注意类名必须为 Main, 不要有任何 package xxx 信息
// public class Main {
//     static int count = 0;
//     static int n;
//     static int[] path;
//     static int[] question;
//     static boolean[] vis;
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         //1.用dfs列出所有的排列结果
//         //数组全部向后移动一位
//         n = in.nextInt();
//         path = new int[n + 1];
//         question = new int[n + 1];
//         vis = new boolean[n + 1];
//         for(int i = 1;i <= n;i++){
//             question[i] = in.nextInt();
//         }
//         dfs(n,1);
//         // System.out.println(count);

//         //2.用 count 统计个数

//     }
//     public static void dfs(int n,int step){
//         if(step == n + 1){
//             // for(int i = 1;i <= n;i++){
//             //     System.out.print(path[i] + " ");
//             // }
//             // System.out.println();
//             return;//忘记ruturn了
//         }
//         for(int i = 1;i <= n;i++){
//             if(vis[i] == true){
//                 continue;
//             }
//             path[step] = i;
//             vis[i] = true;
//             dfs(n,step + 1);
//             path[step] = 0;//回溯
//             vis[i] = false;
//         }
//     }
//     public static boolean check(){
//         for(int i = 1;i <= n;i++){
//             if(question[i] == i){
//                 continue;
//             }else{
//                 for(int j = 1;j <= n;j++){
//                     if(path[j] == i){
//                         return true;
//                     }
//                     if(path[j] == question[i]){
//                         return false;
//                     }
//                 }
//             }
//         }
//         return true;
//     }
// }