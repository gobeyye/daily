package test2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-19
 * Time: 19:41
 */
import java.io.*;
import java.util.*;
class Read{
    StringTokenizer st = new StringTokenizer("");
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String next() throws IOException{
        while(!st.hasMoreTokens()){
            st = new StringTokenizer(bf.readLine());
        }
        return st.nextToken();
    }
    int nextInt() throws IOException{
        return Integer.parseInt(next());
    }
}
public class Main {
    public static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    public static Read in = new Read();
    public static void main(String[] args) throws IOException{

        int n = in.nextInt(),x = in.nextInt();
        int[] nums = new int[n];
        int sum = 0;
        int len = 0;
        int ans = Integer.MAX_VALUE;
        int ansleft = 0;
        int ansright = 0;
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        for(int right = 0,left = 0;right < n;right++){
            sum += nums[right];
            len++;
            while(left <= right && sum >= x){
                if(ans > len){
                    ans = len;
                    ansleft = left;
                    ansright = right;
                }
                sum -= nums[left++];
                len--;
            }
        }
        System.out.print((ansleft + 1) + " " + (ansright + 1));
    }

}
