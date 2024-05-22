/*


*/
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-21
 * Time: 16:53
 *//*








//import java.util.*;
//class Student{
//    int a;
//    int b;
//    int c;
//    int w;
//    public Student(){
//
//    }
//    public Student(int a,int b,int c,int w){
//        this.a = a;this.b = b;this.c = c;this.w = w;
//    }
//}
//public class Main {
//    static int n;
//    static boolean[] vis;
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        n = in.nextInt();
//        Student[] nums = new Student[n];
//        vis = new boolean[n];
//        //1.存入 student
//        for(int i = 0;i < n;i++){
//            int x = in.nextInt(),y = in.nextInt(),z = in.nextInt(),w = in.nextInt();
//            nums[i] = new Student(x,y,z,w);
//        }
//        //2.dfs
//        double ret = Double.MAX_VALUE;
//        for(int i = 0;i < n;i++){
//            vis[i] = true;
//            ret = Math.min(ret,dfs(nums,1,i,0));
//            vis[i] = false;//回溯
//        }
//        System.out.printf("%.2f",ret);
//    }
//    public static double dfs(Student[] nums,int step,int star,double path){
//        if(step == n){
//            return path;
//        }
//        double ret = Double.MAX_VALUE;
//        for(int i = 0;i < n;i++){
//            if(!vis[i]){
//                //先正常写
//                double tmp = Sum(nums,star,i);
//                vis[i] = true;
//                ret = Math.min(ret,dfs(nums,step + 1,i,path + tmp));
//                vis[i] = false;
//            }
//        }
//        return ret;
//    }
//    public static double Sum(Student[] nums,int star,int end){
//        long tmp1 = (long)Math.pow((nums[star].a - nums[end].a),2);
//        long tmp2 = (long)Math.pow((nums[star].b - nums[end].b),2);
//        long tmp3 = (long)Math.pow((nums[star].c - nums[end].c),2);
//        double sum = tmp1 + tmp2 + tmp3;
//        sum = Math.sqrt(sum);
//        return sum * nums[end].w;
//    }
//}





//状态压缩 dp



import java.util.*;
public class Main{
    static class Node{
        int x,y,z;
        int w;
        public Node(int x,int y,int z,int w){
            this.x = x;
            this.y = y;
            this.z = z;
            this.w = w;
        }
        public Node(){

        }
    }
    public static double square(double x){
        return x * x;
    }
    public static Node[] nodes;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = (1 << n);
        nodes = new Node[n];
        for(int i = 0;i < n;i++){
            int x = in.nextInt(),y = in.nextInt(),z = in.nextInt(),w = in.nextInt();
            nodes[i] = new Node(x,y,z,w);
        }
        double[][] dp = new double[m][n];//dp状态
        for(double[] tmp:dp){
            Arrays.fill(tmp,Double.MAX_VALUE);
        }
        for(int i=0;i<(1<<n);i++){
            for(int j=0;j<n;j++){
                if((i>>j&1)==1){
                    for(int k=0;k<n;k++){
                        if((i>>k&1)==1)
                            dp[i][j]=Math.min(dp[i][j],dp[i-(1<<j)][k]+dis(k,j));
                    }
                }
            }
        }
        double ret = Double.MAX_VALUE;

        for(int i = 0;i < n;i++){
            ret = Math.min(ret,dp[m - 1][i]);
        }
        System.out.printf("%.2f",ret);

    }
    public static double dis(int st,int ed){//没有问题
        return Math.sqrt(square(nodes[st].x - nodes[ed].x) + square(nodes[st].y - nodes[ed].y) +
                square(nodes[st].z - nodes[ed].z)) * nodes[ed].w;
    }

}*/
