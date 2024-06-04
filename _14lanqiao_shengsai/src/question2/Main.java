package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-04
 * Time: 15:45
 */
public class Main {
    public static void main(String[] args) {
        int count = 0;
        for(long i = 1;;i++){
            if(i % binary(i,2) == 0 && i % binary(i,8) ==0 && i % binary(i,10) == 0
            && i % binary(i,16) == 0){//根据题意模拟
                count++;
            }
            if(count == 2023){
                System.out.println(i);
                return;
            }
        }
    }
    public static int binary(long n,int base){//求出 n 在 base 进制下的各位数和
        int sum = 0;
        while(n > 0){
            sum += n % base;
            n /= base;
        }
        return sum;
    }
}
