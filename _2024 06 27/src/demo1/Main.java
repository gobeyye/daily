package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-27
 * Time: 8:54
 */
//import java.util.*;
//public class Main{
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int a = in.nextInt(),b = in.nextInt();
//        int[][] nums = new int[n][2];
//        for(int i = 0;i < n;i++){
//            nums[i][0] = in.nextInt();
//            nums[i][1] = in.nextInt();
//        }
//        //排序
//        Arrays.sort(nums,(o1,o2) -> {
//            if(o1[1] > o2[1]) return 1;
//            else if(o1[1] == o2[1]) return 0;
//            else return -1;
//        });
//        //前缀和，优化
//        int[] prev = new int[n];
//        prev[0] = a;
//        for(int i = 1;i < n;i++){
//            prev[i] = nums[i - 1][0] * prev[i - 1];
//        }
//        int max = 0;
//        for(int i = 0;i < n;i++){
//            max = Math.max(max,(prev[i] / nums[i][1]));
//        }
//        System.out.println(max);
//
//    }
//}











import java.util.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int a = in.nextInt(),b = in.nextInt();
        BigInteger a = new BigInteger(in.next());
        BigInteger b = new BigInteger(in.next());
        List<BigInteger[]> ret = new ArrayList<>();
        for(int i = 0;i < n;i++){
            BigInteger[] tmp = new BigInteger[2];
            tmp[0] = new BigInteger(in.next());
            tmp[1] = new BigInteger(in.next());
            ret.add(tmp);
        }
        Collections.sort(ret,(o1,o2) -> {
            return o1[1].multiply(o1[0]).compareTo(o2[0].multiply(o2[1]));
        });
//        for(int i = 0;i < n;i++){
//            System.out.println(ret.get(i)[0] + " " + ret.get(i)[1]);
//        }
        //前缀和，优化
//        int[] prev = new int[n];
//        prev[0] = a;
        BigInteger[] prev = new BigInteger[n];
        prev[0] = a;
        for(int i = 1;i < n;i++){
//            prev[i] = nums[i - 1][0] * prev[i - 1];
//            prev[i] = ret.get(i - 1)[0] * prev[i - 1];
            prev[i] = ret.get(i - 1)[0].multiply(prev[i - 1]);
        }
        BigInteger max = new BigInteger("0");
        for(int i = 0;i < n;i++){
//            max = Math.max(max,(prev[i] / nums[i][1]));
//            max = Math.max(max,(prev[i].divide(ret.get(i)[1])));
            if(max.compareTo(prev[i].divide(ret.get(i)[1])) < 0){
                max = prev[i].divide(ret.get(i)[1]);
            }
        }

        System.out.println(max);
    }
}