package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-30
 * Time: 19:27
 */
/*import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static int hhh = (int)1e5 + 10;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),m = in.nextInt();
        int[] hash = new int[hhh];
        for(int i = 0;i < n;i++){
            int tmp = in.nextInt();
            hash[tmp]++;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)->o2-o1);
        int count = 0;
        for(int i = 0;i < hhh;i++){
            if(hash[i] != 0){
                count++;
                queue.offer(hash[i]);
            }
        }
        if(count > m){
            System.out.println(-1);
            return;
        }
        while(m - count > 0){
            int tmp = queue.poll();
            if(tmp % 2 == 0){
                int h = tmp / 2;
                if(h == 0){
                    h = 1;
                }
                queue.offer(h);
                queue.offer(h);
            }else{
                int h = tmp / 2;
                if(h == 0){
                    h = 1;
                    queue.offer(h);
                    queue.offer(h);
                }else{
                    queue.offer(h);
                    queue.offer(h + 1);
                }
            }
            m--;
        }
        int h = queue.size();
        for(int i = 0;i < h;i++){
            System.out.println(queue.poll() + " ");
        }
    }
}*/


import java.util.*;
public class Main{
    static int h = (int)1e5 + 10;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),m = in.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            int tmp = in.nextInt();
            map.put(map.size(),map.getOrDefault(tmp,0) + 1);
        }
        for(int x = 1;x <= n;x++){
            int count = 0;
            for(int j = 0;j < map.size();j++){
                count += map.get(j) / x + (map.get(j) % x == 0 ? 0 : 1);
            }
            if(count <= m){
                System.out.println(x);
                return;
            }
        }

    }
}
