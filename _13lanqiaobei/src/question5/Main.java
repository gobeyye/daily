package question5;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-24
 * Time: 22:48
 */
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long k = in.nextLong();
        System.out.println(k * 5L);
    }
}
*/




/*import java.util.Scanner;
public class Main {
    //后面以0 结尾的一定是5！....(5的倍数的阶乘) 所以只需要判断5的倍数的阶乘
    //(判断的数)/5 就是含有5的个数 也是阶乘后0的个数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long count;
        long a = 5;//直接从5的阶乘(120)开始判断
        while (true) {
            long tempA = a;
            count = 0;
            while (tempA > 0) {
                tempA /= 5;
                count += tempA;
            }
            if (count < k) {
                a += 5;
            } else if (count == k) {
                System.out.println(a);
                break;
            } else {
                System.out.println(-1);
                break;
            }
        }
    }
}*/









/*import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        long count; // 含有5的个数 也是阶乘后0的个数
        long a = 5; // 直接从5的阶乘(120)开始判断
        while (true) {
            long tempA = a;
            count = 0;
            while (tempA > 0) {
                tempA /= 5;
                count += tempA;
            }

            if (count < k) {
                a += 5;
            } else if (count == k) {
                System.out.println(a);
                break;
            } else {
                System.out.println(-1);
                break;
            }
        }
    }

}*/
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long k = in.nextLong();
        int count = 0;
        long a = 5;
        while(true){
            long tempA = a;
            while(tempA != 0){
                count++;
                tempA /= 5;
            }
            if(count == k){
                System.out.println(a);
                return;
            }else if(count < k){
                a += 5;
            }else{
                System.out.println(-1);
                return;
            }
        }

    }
}*/
