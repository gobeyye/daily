package demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-16
 * Time: 15:38
 */
public class demo5 {
    public static void main(String[] args) {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        ret.add(new ArrayList(path));
    }
}
