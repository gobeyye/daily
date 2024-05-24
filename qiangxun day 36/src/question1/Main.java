package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-24
 * Time: 20:09
 */






import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1.求长度
        String a = in.next();//nextInt是用来求整数的
        int n = a.length();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = a.charAt(i) - '0';
        }
        int ans = 0;
        //2.用int数组来模拟哈希表
        int[] hash = new int[10];
        //3.求数
        for(int i = n - 1;i >= 0;i--){
            hash[arr[i]]++;
            if(hash[arr[i]] == 1){
                //第一次出现
                ans = ans * 10 + arr[i];
            }
        }
        System.out.println(ans);
    }
}
