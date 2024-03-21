/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-21
 * Time: 15:02
 */
import java.util.*;
public class Test1 {
    public static void main(String[] args) {
    }


    public static List<Integer> findAnagrams(String s, String p) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();
        List<Integer> ret = new ArrayList<>();
        int n1 = s.length();
        int n2 = p.length();
        boolean key = true;
        for(int i = 0;i < n2;i++){
            char ch = p.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0) + 1);
        }
        int left = 0,right= 0;
        for(int count = 0;right < n1;right++){
            key = true;
            char ch = s.charAt(right);
            count++;
            map1.put(ch,map1.getOrDefault(ch,0) + 1);
            if(count > n2){
                char tmp = s.charAt(left++);
                map1.put(tmp,map1.get(tmp) - 1);
                if(map1.get(tmp) == 0){
                    map1.remove(tmp);
                }
                count--;
            }
            if(count == n2){
                if(key == true){
                    for(int i = 0;i < n2;i++){
                        char tmp1 = p.charAt(i);
                        if(map2.get(tmp1) != map1.getOrDefault(tmp1,-1)){
                            key = false;
                        }
                    }
                }
                if(key == true){
                    ret.add(left);
                }
            }

        }
        return ret;

    }
    public static void main1(String[] args) {
        String s = "baa";
        String t = "aa";
        List<Integer> ret = findAnagrams(s,t);
        System.out.println(ret);
    }
}
