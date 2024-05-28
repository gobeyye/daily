package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-28
 * Time: 16:37
 */



//欧拉模板
public class Main {
    static int[] prime;//存储素数
    static boolean[] vis;//一个数是否是素数,0表示素数，1表示不是素数
    static int cnt;//素数个数
    public static void main(String[] args) {
        int n = 12;
        vis = new boolean[20];
        prime = new int[20];
        is_prime(n);
        for(int x:prime){
            System.out.print(x + " ");
        }
    }
    public static void is_prime(int n){
        for(int i = 2;i <= n;i++){
            if(!vis[i]){
                prime[cnt++] = i;
            }
            for(int j = 0;j < cnt && i * prime[j] <= n;j++){
                vis[i * prime[j]] = true;
                if(i % prime[j] == 0){
                    break;
                }
            }
        }
    }
}
