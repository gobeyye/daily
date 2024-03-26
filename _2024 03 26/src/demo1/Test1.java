package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-26
 * Time: 21:59
 */
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
class cmp implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
public class Test1 {
    public static void main(String[] args) {
        List<Integer> ret = new ArrayList<>();
        ret.add(4);
        ret.add(3);
        ret.add(2);
        ret.add(1);
        ret.sort(new cmp());
        for(Integer x:ret){
            System.out.print(x + " ");
        }
    }
}
