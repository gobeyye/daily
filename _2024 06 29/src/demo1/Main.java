
package demo1;


/*
*
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-29
 * Time: 9:35
*/


import java.util.*;
public class Main {
    static int n;
    static List<int[]> ret;
    static boolean[] visCol;
    static boolean[] visMaDia;
    static boolean[] visSeDia;
    static int[] path;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        ret = new ArrayList<>();
        path = new int[n + 1];
        visCol = new boolean[n + 1];
        visMaDia = new boolean[2 * n + 1];
        visSeDia = new boolean[2 * n + 1];
        dfs(1);
        Collections.sort(ret,(o1,o2)->{
            int len = o1.length;
            for(int i = 0;i < len;i++){
                if(o1[i] > o2[i]) return 1;
                else if(o1[i] < o2[i]) return -1;
            }
            //全部相等的情况
            return 0;
        });
        for(int i = 0;i < 3;i++){
            int[] tmp = ret.get(i);
            for(int j = 0;j < n;j++){
                System.out.print(tmp[j] + " ");
            }
            System.out.println();
        }
        System.out.println(ret.size());
    }
    public static void dfs(int step){
        if(step == n + 1){
            int[] arr = new int[n + 1];
            arr = Arrays.copyOf(path,n + 1);
            ret.add(arr);
            return;
        }
        for(int i = 1;i <= n;i++){
            if(!visCol[i] && !visMaDia[step + i] && !visSeDia[i - step + n]){
                path[step - 1] = i; //不用回溯
                visCol[i] = true;
                visMaDia[step + i] = true;
                visSeDia[i - step + n] = true;
                dfs(step + 1);
                visCol[i] = false;
                visMaDia[step + i] = false;
                visSeDia[i - step + n] = false;
            }
        }
    }
}

