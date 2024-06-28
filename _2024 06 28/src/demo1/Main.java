package demo1;
//
//import java.util.Scanner;
//
//import static javafx.application.Platform.exit;
//
///**
// * Created with IntelliJ IDEA.
// * Description:
// * User: HXL
// * Date: 2024-06-28
// * Time: 8:28
// */
//
//public class Main {
//    static double m,y,s;
//    static int t;
//    public static void out(double k){
//        System.out.printf("%.1f",k * 100);
////        exit();
//    }
//    public static void solve (double l,double r){
//        double k = (l + r) / 2,u = r - l;
//        double a = m;
//        if(u < 0.0001) {
//            out(k);
//            return;
//        }
//        for(int i = 1;i <= t;i++){
//            a = a * (1 + k) - y;
//        }
//        if(a > 0) solve(l,k);
//        if(a < 0) solve(k,r);
//        if(a == 0) {
//            out(k);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        m = in.nextInt();y = in.nextInt();t = in.nextInt();
//        solve(0,5);
//    }
//}


import java.util.*;
public class Main{
    static double prv,moValue;//初始值和每月的还贷钱
    static int months;//月数
    static double limit = 0.0001;//二分的临界值
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        prv = in.nextInt();moValue = in.nextInt();months = in.nextInt();
        binary(0,5);
    }

    private static void binary(double left, double right) {
        if(left > right) return;
        double k = left + (right - left) / 2;//查找利率
        double a = prv;
        double u = right - left;
        if(u <= limit){//在一定精度内，可以认为是正确的
            System.out.printf("%.1f",k * 100);
            return;
        }
        for(int i = 1;i <= months;i++){
            a = a * (1 + k) - moValue;//计算公式
        }
        if(a < 0) binary(k,right);
        else if(a > 0) binary(left,k);
        else System.out.printf("%.1f",k * 100);
    }
}
