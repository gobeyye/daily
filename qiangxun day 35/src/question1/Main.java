package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-23
 * Time: 21:43
 */





import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int[] arr = new int[n + 1];
            int j = n + 1;
            int count = 0;
            for (int i = 0; i <= n; i++) {
                arr[i] = i;
            }
            while (j != 1) {
                for (int i = 0; i < j; i++) {
                    if ((i + 1) % 2 == 0) {
                        arr[count++] = arr[i];
                    }
                }
                j = count;
                count = 0;
            }
            System.out.println(arr[0]);
        }
    }
}