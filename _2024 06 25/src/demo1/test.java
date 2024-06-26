package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-25
 * Time: 10:59
 */
//import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>((o1,o2)->{
            return o2 - o1;
        });
        map.put(2,"a");
        map.put(5,"d");
        map.put(10,"b");
        map.put(1,"c");
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
