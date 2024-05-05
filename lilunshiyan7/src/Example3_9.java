/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-05
 * Time: 23:42
 */
import java.util.*;
class IndexOutException extends Exception{
    public IndexOutException(String message){
        super(message);
    }
    public IndexOutException(){
        super();
    }
}
public class Example3_9 {
    public static void main(String[] args) throws IndexOutException{
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while(reader.hasNextDouble()){
            double x = reader.nextDouble();
            if(x > 100 || x < 0){
                throw new IndexOutException("下标越界异常");
            }
            m = m + 1;
            sum = sum + x;
        }
        System.out.printf("%d个数的和为%f\n",m,sum);
        System.out.printf("%d个数的平均值是%f\n",m,sum/m);
    }
}
