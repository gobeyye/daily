package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-24
 * Time: 20:10
 */
import java.util.Scanner;
import java.util.*;
import java.util.Random;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int ans = random.nextInt(Integer.MAX_VALUE);
        System.out.println(ans);
    }
}