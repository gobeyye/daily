package question4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-04
 * Time: 19:53
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //读入数据
        long x1 = in.nextLong(),y1 = in.nextLong(),x2 = in.nextLong(),y2 = in.nextLong();
        long x3 = in.nextLong(),y3 = in.nextLong(),x4 = in.nextLong(),y4 = in.nextLong();
        long sum = ((y4 - y3) * (x4 - x3)) + ((y2 - y1) * (x2 - x1));//全部面积
        long sub = Math.max(0,((Math.min(y4,y2) - Math.max(y1,y3)) * (Math.min(x4,x2) - Math.max(x1,x3))));//重复面积
        sum -= sub;
        System.out.println(sum);
    }
}
