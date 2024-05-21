/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        try{
            int[] num = new int[2];
            num[3] = 1;
            System.out.println(num[3]);
        }catch(ArrayIndexOutOfBoundsException e){

        }
        System.out.println("hello");

    }
}