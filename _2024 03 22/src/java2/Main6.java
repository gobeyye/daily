package java2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-22
 * Time: 20:08
 */
public class Main6 {
    public static void main(String[] args){
        int sum = 0;
        int count = 1;
        for(int i = 1;i < 8888;i++){
            sum += i;
            count++;
            if(sum >= 8888){
                break;
            }
        }
        System.out.println(count - 1);
    }
}
