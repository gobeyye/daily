package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-26
 * Time: 9:17
 */
import java.util.*;
public class demo1 {
    public static void main(String[] args) {
        Map<String,Integer> hash1 = new HashMap<>();
        hash1.put("a",5);
        hash1.put("b",3);
        hash1.put("c",7);
        hash1.put("d",1);
        List<Map.Entry<String,Integer>> ret = new ArrayList<>(hash1.entrySet());
        Collections.sort(ret,(o1,o2)->{
            return o1.getValue() - o2.getValue();
        });
        for(Map.Entry<String,Integer> entry:ret){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
