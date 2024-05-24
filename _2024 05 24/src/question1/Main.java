package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-24
 * Time: 17:03
 */






import java.util.*;
public class Main {
    static int[] elem;
    public static void main(String[] args) {
        //最小生成树
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[][] edges = new int[m][3];//存储的是边的个数，不是节点的个数
        elem = new int[n + 1];
        Arrays.fill(elem,-1);//初始化elem
        for(int i = 0;i < m;i++){//存入边的关系
            int u = in.nextInt(),v = in.nextInt(),w = in.nextInt();
            edges[i][0] = u;edges[i][1] = v;edges[i][2] = w;
        }

        //按照权值排序
        Arrays.sort(edges,(o1,o2) -> {
            return o1[2] > o2[2] ? 1 : -1;
        });
        int x = 0;//表示已经安排边的个数
        for(int i = 0;i < m;i++){
            int u = edges[i][0],v = edges[i][1],w = edges[i][2];
            if(!same(u,v)){
                x++;//边的个数加 + 1
                union(u,v);
            }
            if(x == n - 1){
                System.out.println(w);
                return;
            }
        }
        System.out.println(-1);
    }
    public static boolean same(int u,int v){
        int index1 = findRoot(u);
        int index2 = findRoot(v);
        return index1 == index2;
    }
    public static int findRoot(int x){
        while(elem[x] >= 0){
            x = elem[x];
        }
        return x;
    }
    public static void union(int u,int v){
        int index1 = findRoot(u);
        int index2 = findRoot(v);
        //规范在 index1 是比较大的情况
        if(index1 != index2){
            //不相等的情况下才需要合并
            //交换
            //优化这样会比较快一点
            if(Math.abs(elem[index1]) < Math.abs(elem[index2])){
                //表示index2 的值是比较大的
                int tmp = index1;
                index1 = index2;
                index2 = tmp;
            }
            elem[index1] += elem[index2];
            elem[index2] = index1;//存储index1 下标
        }
    }
}
