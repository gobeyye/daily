package demo3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-13
 * Time: 17:19
 */
public class test1 {
    public static void main1(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"aaa");
        map.put(2,"bbb");
        map.put(3,"ccc");
        map.keySet();
        System.out.println(map.values());

    }

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"aaa");
        map.put(2,"bbb");
        map.put(3,"ccc");
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
