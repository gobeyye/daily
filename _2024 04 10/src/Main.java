import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    public static void main(String[] args) {

        Map<String,String> map = new LinkedHashMap<>(16,0.75f,true);
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        map.get("1");
        map.get("2");
        Set<Map.Entry<String,String>> set = map.entrySet();

        for(Map.Entry<String,String> entry:set){
            System.out.print(entry.getKey());
            System.out.print(" ");
            System.out.print(entry.getValue());
            System.out.println();
        }
    }
}