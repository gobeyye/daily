package ccpc1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-24
 * Time: 15:37
 */




//快读模板
import java.util.*;
import java.io.*;
public class Main{
    public static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    public static Read in = new Read();
    public static void main(String[] args) throws IOException{
        out.close();

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
    double nextDouble() throws IOException{
        return Double.parseDouble(next());
    }
}
