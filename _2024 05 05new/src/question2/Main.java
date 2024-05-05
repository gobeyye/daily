package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-05
 * Time: 21:40
 */
import java.util.*;
import java.io.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static Read in = new Read();
    public static void main(String[] args)throws IOException {
        int n = in.nextInt(),k = in.nextInt();
        long[] a = new long[n];
        long[] b = new long[n];
        long[][] ab = new long[n][2];
        for(int i = 0;i < n;i++){
            ab[i][0] = in.nextInt();
        }
        for(int i = 0;i < n;i++){
            ab[i][1] = in.nextInt();
        }
        PriorityQueue<long[]> queue = new PriorityQueue<>((o1,o2)->{
            if(o1[1] == o2[1]){
                return (int)(o2[0] - o1[0]);
            }else{
                return (int)(o1[1] - o2[1]);
            }
        });///////////
        for(int i = 0;i < n;i++){
            if(queue.size() < k){
                queue.offer(ab[i]);
            }else{
                if(queue.peek()[1] <= ab[i][1]){
                    if(ab[i][1] > queue.peek()[1]){
                        queue.poll();
                        queue.offer(ab[i]);
                    }else if(ab[i][0] < queue.peek()[0]){
                        queue.poll();
                        queue.offer(ab[i]);
                    }
                }
            }
        }
        long suan = 0;
        long tian = 0;
        while(!queue.isEmpty()){
            long[] tmp = queue.poll();
            suan += tmp[0];
            tian += tmp[1];
        }
        System.out.println(suan + " " + tian);
    }
}
class tmp implements Comparator<long[]>{
    public int compare(long[] o1,long[] o2){
        if(o1[1] == o2[1]){//甜度相同的情况
            return (int)(o2[0] - o1[0]);
        }else{
            return (int)(o1[1] - o2[1]);
        }
    }
}

class Read{
    StringTokenizer st = new StringTokenizer("");
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String next() throws IOException{
        while(!st.hasMoreTokens()){
            st = new StringTokenizer(bf.readLine());
        }
        return st.nextToken();
    }
    String nextLine() throws IOException{
        return bf.readLine();
    }
    int nextInt() throws IOException{
        return Integer.parseInt(next());
    }
    long nextLong() throws IOException{
        return Long.parseLong(next());
    }
    double nextDouble() throws IOException{
        return Double.parseDouble(next());
    }
}
