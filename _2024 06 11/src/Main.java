import java.util.Comparator;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
class cmp implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
public class Main implements Comparable<Integer> {
    @Override
    public int compareTo(Integer o) {
        return 0;
    }

    public static void main(String[] args) {
//        Timer timer = new Timer();
//        TimerTask task = new TimerTask() {
//            @Override
//            public void run() {
//
//            }
//        }
//        System.out.println("Hello world!");
    }
}