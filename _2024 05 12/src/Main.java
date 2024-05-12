import javafx.util.Pair;
import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */

public class Main {
    public List<String> topKFrequent(String[] words, int k) {
        //1.使用堆解决加二维数据
        int n = words.length;
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            map.put(words[i],map.getOrDefault(words[i],0) + 1);
        }
        //2.遍历words把数据存入堆中（小根堆利用Pair来比较）
        PriorityQueue<Pair<String,Integer>> heap = new PriorityQueue<>((o1,o2)->{
            if(o1.getValue() == o2.getValue()){
                return o2.getKey().compareTo(o1.getKey());
            }else{
                return o1.getValue() - o2.getValue();
            }

        });//创建小根堆
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            heap.offer(new Pair<>(entry.getKey(),entry.getValue()));
        }
        //3.把数据从队中导入ret中（次数相同的要排序）
        List<String> ret = new ArrayList<>();
        while(!heap.isEmpty()){
            ret.add(heap.poll().getKey());
        }
        //4.最后把ret反转即可
        Collections.reverse(ret);
        return ret;
    }
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("aaa",11);
        map.put("bbb",22);
        map.put("ccc",33);
        List<Integer> ret = new ArrayList<>();
        Collections.sort(ret);
        String s = "aaa";
        s.equals("bbb");
        s.compareTo("bbb");

//        Set<Map.Entry<String,Integer>> set = map.entrySet();
//        for(Map.Entry<String,Integer> entry:set){
//            System.out.println(entry.getKey() + "    " +  entry.getValue());
//        }
    }
}