package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-16
 * Time: 23:17
 */
import java.util.*;
public class demo6 {
    public static void main(String[] args) {
        List<Integer> ret = new ArrayList<>();
        ret = Collections.synchronizedList(new ArrayList<>());
    }
}
