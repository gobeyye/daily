package demo1;





import java.util.Scanner;

import java.util.*;
import java.io.*;
// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static Read in = new Read();
    public static void main(String[] args) throws IOException {
//    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] nums = new int[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                nums[i][j] = in.nextInt();
            }
        }
        //1.分别统计x = 1和x = 2的个数，再 % 2
        int q = in.nextInt();
        int count1 = 0;
        int count2 = 0;
        while(q > 0){
            int x = in.nextInt();
            if(x == 1){
                count1++;
            }else if(x == 2){
                count2++;
            }
            q--;
        }
        count1 %= 2;count2 %= 2;
        //2.分别处理，创建新的数组
        int[][] newNums = new int[n][n];
        int x = 0,y = 0;
        if(count1 != 0){
            for(int i = n - 1;i >= 0;i--){
                for(int j = n - 1;j >= 0;j--){
                    newNums[x][y++] = nums[i][j];
                    if(y == n){
                        y = 0;
                        x++;
                    } 
                }
            }
            nums = newNums;
        }
        if(count2 != 0){
            // newNums = new int[n][n];
            if(n % 2 == 0){
                //偶数
                for(int i = n / 2;i <= n - 1;i++){
                    for(int j = 0;j < n;j++){
                    	System.out.print(nums[i][j] + " ");
                    }
                    System.out.println();
                }
                for(int i = 0;i <= n / 2 - 1;i++){
                    for(int j = 0;j < n;j++){
                        System.out.print(nums[i][j] + " ");
                    }
                    System.out.println();
                }
            }else{
                //奇数
                for(int i = (n + 1) / 2;i <= n - 1;i++){
                    for(int j = 0;j < n;j++){
                    	System.out.print(nums[i][j] + " ");
                    }
                    System.out.println();
                }
                for(int i = 0;i <= n / 2;i++){
                    for(int j = 0;j < n;j++){
                        System.out.print(nums[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }else{
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++){
                    System.out.print(nums[i][j] + " ");
                }
                System.out.println();
            }
        }
        System.out.close();
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
    int nextInt() throws IOException{
        return Integer.parseInt(next());
    }
    // String 
}
