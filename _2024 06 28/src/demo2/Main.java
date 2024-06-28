package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-28
 * Time: 9:54
 */
import com.sun.xml.internal.ws.api.ha.StickyFeature;

//import java.util.*;
//import java.io.*;
//public class Main {
//    static int n;
//    static double p;
//    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
//    static Read in = new Read();
//    static double[][] nums;
//    static double limit = 0.01;
////    static double[][]
//    public static void main(String[] args) throws IOException{
////        Scanner in = new Scanner(System.in);
//        n = in.nextInt();p = in.nextInt();
//        nums = new double[n][2];
//        //读入数据
//        for(int i = 0;i < n;i++){
//            nums[i][0] = in.nextInt();nums[i][1] = in.nextInt();
//        }
//        binary(0,100010);
//        out.close();
//    }
//    public static void binary(double left,double right){
//        if(left > right) return;
//        double u = right - left;
//        double mid = left + (right - left) / 2;//表示枚举的日期
//        if(mid > 100000) {//表示可以无限使用
//            System.out.println(-1);
//            return;
//        }
//        double a = 0,b = 0;
//        double p1 = p * mid;//还要乘于对应可以使用的天数，因为是每秒充能，而不是一开始就给你一个总的。
//        double sub = 0;
//        for(int i = 0;i < n;i++){
//            a = nums[i][0];b = nums[i][1];
//            double div = b / a;//可以使用的天数
//            if(div < mid){
//                sub += mid * a - b;
//            }
//        }
//        p1 -= sub;
//        if(p1 > 0) binary(mid,right);
//        else if(p1 < 0) binary(left,mid);
//        else System.out.println(mid);
//    }
//}
//class Read{
//    StringTokenizer st = new StringTokenizer("");
//    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//    String next() throws IOException{
//        while(!st.hasMoreTokens()){
//            st = new StringTokenizer(bf.readLine());
//        }
//        return st.nextToken();
//    }
//    int nextInt() throws IOException{
//        return Integer.parseInt(next());
//    }
//    double nextDouble() throws IOException{
//        return Double.parseDouble(next());
//    }
//
//}






import java.util.*;
import java.io.*;
public class Main {
    static int n;
    static double p;
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static Read in = new Read();
    static double[][] nums;
    static double limit = 0.0001;
    public static void main(String[] args) throws IOException{
//        Scanner in = new Scanner(System.in);
        n = in.nextInt();p = in.nextInt();
        nums = new double[n][2];
        double sum = 0;
        //读入数据
        for(int i = 0;i < n;i++){
            nums[i][0] = in.nextInt();nums[i][1] = in.nextInt();
            sum += nums[i][0];
        }
        if(p >= sum){
            System.out.println(-1);
            return;
        }
        binary(0,1e10);//这里必须要开 1e10，题目没有错，因为在充电的情况下，最大会达到 1e10.
        out.close();
    }
    public static void binary(double left,double right){
        if(left > right) return;
        double u = right - left;
        double mid = left + (right - left) / 2;//表示枚举的日期
//        if(mid > 100000) {//表示可以无限使用
////            System.out.printf("%.10f",-1);
//            System.out.printf("%.10f",-1.0);
//            return;
//        }
        double a = 0,b = 0;
        double p1 = p * mid;//还要乘于对应可以使用的天数，因为是每秒充能，而不是一开始就给你一个总的。
        double sub = 0;
        if(u <= limit){//最 sb 的地方，我给忘了，符合一定精度就可以了。
            System.out.printf("%.10f",mid);
            return;
        }
        for(int i = 0;i < n;i++){
            a = nums[i][0];b = nums[i][1];
            double div = b / a;//可以使用的天数
            if(div < mid){
                sub += mid * a - b;
            }
        }
        p1 -= sub;
        if(p1 > 0) binary(mid,right);
        else if(p1 < 0) binary(left,mid);
        else System.out.println(mid);
    }
}
class Read{
    StringTokenizer st = new StringTokenizer("");
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String next() throws IOException{
        while(!st.hasMoreTokens()){
            st = new StringTokenizer(bf.readLine());
        }
        return st.nextToken();
    }
    int nextInt() throws IOException{
        return Integer.parseInt(next());
    }
    double nextDouble() throws IOException{
        return Double.parseDouble(next());
    }

}