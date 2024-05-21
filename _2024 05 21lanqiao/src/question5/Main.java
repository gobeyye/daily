package question5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-21
 * Time: 16:53
 */







import java.util.*;
class Student{
    int a;
    int b;
    int c;
    int w;
    public Student(){

    }
    public Student(int a,int b,int c,int w){
        this.a = a;this.b = b;this.c = c;this.w = w;
    }
}
public class Main {
    static int n;
    static boolean[] vis;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Student[] nums = new Student[n];
        vis = new boolean[n];
        //1.存入 student
        for(int i = 0;i < n;i++){
            int x = in.nextInt(),y = in.nextInt(),z = in.nextInt(),w = in.nextInt();
            nums[i] = new Student(x,y,z,w);
        }
        //2.dfs
        double ret = Double.MAX_VALUE;
        for(int i = 0;i < n;i++){
            vis[i] = true;
            ret = Math.min(ret,dfs(nums,1,i,0));
            vis[i] = false;//回溯
        }
        System.out.printf("%.2f",ret);
    }
    public static double dfs(Student[] nums,int step,int star,double path){
        if(step == n){
            return path;
        }
        double ret = Double.MAX_VALUE;
        for(int i = 0;i < n;i++){
            if(!vis[i]){
                //先正常写
                double tmp = Sum(nums,star,i);
                vis[i] = true;
                ret = Math.min(ret,dfs(nums,step + 1,i,path + tmp));
                vis[i] = false;
            }
        }
        return ret;
    }
    public static double Sum(Student[] nums,int star,int end){
        long tmp1 = (long)Math.pow((nums[star].a - nums[end].a),2);
        long tmp2 = (long)Math.pow((nums[star].b - nums[end].b),2);
        long tmp3 = (long)Math.pow((nums[star].c - nums[end].c),2);
        double sum = tmp1 + tmp2 + tmp3;
        sum = Math.sqrt(sum);
        return sum * nums[end].w;
    }
}
