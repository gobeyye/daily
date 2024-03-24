import java.util.*;
import java.util.function.BiConsumer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */


public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"hello");
        map.put(2,"bbbb");
        map.put(3,"lamba");
        map.put(4,"gobeyye");
        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {

            }
        });
    }
    public static void main4(String[] args) {
        List<String> ret = new ArrayList<>();
        ret.add("hello");
        ret.add("world");
        ret.add("aaaaa");
        ret.add("bcd");
        ret.sort((o1,o2)->o1.compareTo(o2));
        ret.forEach(o1-> System.out.println(o1 + " "));

    }
    public static void main2(String[] args) {
        List<Integer> ret = new ArrayList<>();
        ret.add(1);
        ret.add(14);
        ret.add(13);
        ret.add(11);
        ret.forEach(o1-> System.out.println(o1));
    }
    public static void main1(String[] args) {
        Integer[] nums = {2,5,3,8,5,7,4,5,10};
        Arrays.sort(nums,(o1, o2)->o2 - o1);
        for(Integer x:nums){
            System.out.print(x + " ");
        }
    }
}