package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-24
 * Time: 21:54
 */
public class Main {
    public static void main(String[] args){
        int ret = 1;
        for(int i = 1;i <= 22;i++){
            ret = (ret * 20) % 7 + 1;
        }
        System.out.println(ret);
    }
}
