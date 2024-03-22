package java2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-22
 * Time: 20:08
 */
public class Main4 {
    public static boolean iswan(int n){
        int sum = 0;
        for(int i = 1;i < n;i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum == n;
    }
    public static void main(String[] args){
        for(int i = 1;i <= 1000;i++){
            if(iswan(i)){
                System.out.print(i + " ");
            }
        }
    }
}
