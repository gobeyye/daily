package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-25
 * Time: 22:11
 */




import java.util.*;
import java.util.stream.IntStream;

public class Main {
    static final int MN = (int) 5e5 + 5;
    static final long s64 = Long.MAX_VALUE;
    static final int Mod = 998244353;

    static int solve(int n) {
        n = 30000;  // 默认参数
        List<Integer> a = new ArrayList<>();
        IntStream.range(0, n).forEach(a::add);
        Random rand = new Random();
        for (int i = 0; i < 2000; i++) {
            Collections.shuffle(a, rand);
        }
        return a.get(0);
    }

    public static void main(String[] args) {
        // 优化输入输出流速度
        System.setIn(new java.io.BufferedInputStream(System.in));
        System.setOut(new java.io.PrintStream(new java.io.BufferedOutputStream(System.out)));
        // 种子随机数
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        // 调用solve函数并打印结果
        System.out.println(solve(30000));
    }
}
