import java.util.ArrayList;
import java.util.List;
public class Test6 {
    public static void main(String[] args) {
        List<Integer> ret = new ArrayList<>();
        ret.add(1);
        ret.add(2);
        ret.add(3);
        ret.add(4);
        ret.sort((o1,o2)->o2 - o1);
        for(Integer x:ret){
            System.out.print(x + " ");
        }
    }
}
