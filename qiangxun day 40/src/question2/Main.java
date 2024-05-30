package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-30
 * Time: 16:36
 */
import java.util.*;


public class Main {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param numProject int整型
     * @param groups int整型ArrayList<ArrayList<>>
     * @return int整型ArrayList
     */
    public ArrayList<Integer> findOrder (int numProject, ArrayList<ArrayList<Integer>> groups) {
        // write code here
        //拓扑排序
        //1.准备工作
        ArrayList<Integer> ret = new ArrayList<>();
        int[] in = new int[numProject];
        Map<Integer,List<Integer>> edges = new HashMap<>();
        //2.建图
        for(ArrayList<Integer> list:groups){
            int a = list.get(0),b = list.get(1);
            if(!edges.containsKey(b)){
                edges.put(b,new ArrayList<>());
            }
            edges.get(b).add(a);
            in[a]++;
        }

        Queue<Integer> q = new LinkedList<>();
        //3.拓扑排序
        for(int i = 0;i < numProject;i++){
            if(in[i] == 0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int tmp = q.poll();
            ret.add(tmp);
            for(int x:edges.getOrDefault(tmp,new ArrayList<>())){
                in[x]--;
                if(in[x] == 0){
                    q.add(x);
                }
            }
        }
        // System.out.println("////////////////////////");
        //4.判环
        for(int x:in){
            if(x != 0){
                return new ArrayList<>();
            }
        }
        return ret;
    }
}
