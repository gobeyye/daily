import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        char c = '\0';
        for(int i = 1;i <= 4;i++){
            switch(i){
                case 1:c = 'J';
                    System.out.print(c);
                case 2:c = 'e';
                    System.out.print(c);
                    break;
                case 3:c = 'p';
                    System.out.print(c);
                default:
                    System.out.print("好");
            }
        }
    }
    public static void main2(String[] args) {
        char x = '你',y = 'e',z = '吃';
        if(x > 'A'){
            y = '苹';
            z = '果';
        }
        else
            y = '酸';
        z = '甜';
        System.out.println(x + " " + y + " " + z);
    }
    public static void main1(String[] args) {
        int m = 1000;
        m = m++;
        System.out.println(m);

    }
}