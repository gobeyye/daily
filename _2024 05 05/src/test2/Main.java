package test2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-05
 * Time: 19:52
 */
import java.util.*;
import java.io.*;
public class Main{
    public static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    public static Read in = new Read();
    public static void main(String[] args) throws IOException{
        int n = in.nextInt(),m = in.nextInt();
        int[][] nums = new int[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                nums[i][j] = in.nextInt();
            }
        }
        long[] row = new long[n];   //表示行
        long[] col = new long[m];   //表示列
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                row[i] += nums[i][j];
            }
        }
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                col[i] += nums[j][i];
            }
        }
//        for(int i = 0;i < n;i++){
//            for(int j = 0;j < m;j++){
//                System.out.print(row[i] + col[j] + " ");
//            }
//            System.out.println();
//        }
        for(int i = 0;i < n;i++){
            System.out.println("第" + i + "行: " + row[i]);
        }
        for(int i = 0;i < m;i++){
            System.out.println("第" + i + "列: " + col[i]);
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
    String nextLine() throws IOException {
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