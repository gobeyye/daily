package demo1;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Random;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-19
 * Time: 9:55
 */
public class Main {
    //我的代码
    public static String alienOrder(String[] words) {
        //拓扑排序
        //1.准备工作
        int n = words.length;
        Map<Character,Integer> in = new HashMap<>();//记录入度，必须要初始化，不然就没有入度为 0 的节点
        for(int i = 0;i < words.length;i++){
            for(int j = 0;j < words[i].length();j++){
                in.put(words[i].charAt(j),0);//初始化入度点
            }
        }
        Map<Character,Set<Character>> edges = new HashMap<>();
        StringBuilder sd = new StringBuilder();
        //2.建表
        for(int i = 0;i < n;i++){
            for(int j = i + 1;j < n;j++){
                char[] a = words[i].toCharArray();
                char[] b = words[j].toCharArray();
                for(int k = 0;k < a.length && k < b.length;k++){
                    if(a[k] != b[k]){
                        if(!edges.containsKey(a[k])){
                            edges.put(a[k],new HashSet<>());
                        }
                        if(!edges.get(a[k]).contains(b[k])){
                            edges.get(a[k]).add(b[k]);//建表
                            in.put(b[k],in.get(b[k]) + 1);//入度
                        }
                        break;
                    }
                }
            }
        }

        //3.拓扑排序
        Queue<Character> q = new LinkedList<>();
        for(Map.Entry<Character,Integer> entry:in.entrySet()){// map 不会遍历是自己的事情
            if(entry.getValue() == 0){
                q.add(entry.getKey());
            }
        }
        //////////////////////////////////上面 ok 了
        while(!q.isEmpty()){
            Character tmp = q.poll();
            sd.append(tmp);
            for(Character x:edges.getOrDefault(tmp,new HashSet<>())){
                in.put(x,in.get(x) - 1);
                if(in.get(x) == 0){
                    q.add(x);
                }
            }
        }
        //最后要判断有没有环
        for(char ch:in.keySet()){
            if(in.get(ch) != 0){
                return "";
            }
        }
        String ans = sd.toString();
        return ans;
    }
    public static void main(String[] args) {
        String[] ss = new String[]{"wrt","wrf","er","ett","rftt"};
        String ans = alienOrder(ss);
        System.out.println(ans);

    }
}
