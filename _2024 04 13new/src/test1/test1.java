package test1;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-13
 * Time: 15:21
 */
public class test1 {
    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<>(16,0.75f,true);
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        map.get("1");
        System.out.println(map);
    }
}
