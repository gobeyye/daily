package test1;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-06
 * Time: 8:10
 */
public class Main {
    public List<List<String>> groupAnagrams(String[] strs) {
        //1.转换成排序
        int n = strs.length;
        char[][] s = new char[n][];
        List<List<String>> ret = new ArrayList<>();
        for(int i = 0;i < n;i++){
            s[i] = strs[i].toCharArray();
        }
        for(int i = 0;i < n;i++){
            Arrays.sort(s[i]);
        }
        String[] ss = new String[n];
        for(int i = 0;i < n;i++){
            ss[i] = new String(s[i]);
        }
        Map<String,Integer> map = new HashMap<>();
        int j = 0;
        for(int i = 0;i < n;i++){
            if(!map.containsKey(ss[i])){
                List<String> path = new ArrayList<>();
                map.put(ss[i],j++);
                path.add(strs[i]);
                ret.add(path);
            }else{
                List<String> tmp = ret.get(map.get(ss[i]));
                tmp.add(strs[i]);
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        int n = 10;
        char[][] s = new char[n][];
    }
}
