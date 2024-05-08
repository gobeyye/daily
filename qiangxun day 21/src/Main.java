import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>((o1,o2)->o2 - o1);
        set.add(3);
        set.add(1);
        set.add(2);
        for(int x:set){
            System.out.print(x + " ");
        }
    }
}