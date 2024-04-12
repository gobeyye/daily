package test5;
//////////////////////////////////////////////////






import java.util.Scanner;

//注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
 public static void main(String[] args) {
	 //1.创建 dp 表
	 //2.初始化
	 //3.填表
	 //4.返回值
     Scanner in = new Scanner(System.in);
     // 注意 hasNext 和 hasNextLine 的区别
     int n = in.nextInt(),v = in.nextInt();
     int[] VI = new int[n + 1];
     int[] WI = new int[n + 1];
     for(int i = 1;i <= n;i++) {
    	 VI[i] = in.nextInt();
    	 WI[i] = in.nextInt();
     }
     int[][] dp = new int[n + 1][v + 1];
     for(int i = 1;i <= n;i++) {
    	 for(int j = 1;j <= v;j++) {
    		 dp[i][j] = dp[i - 1][j];
    		 if(j >= VI[i]) {
    			 dp[i][j] = Math.max(dp[i][j],dp[i][j - VI[i]] + WI[i]);
    		 }
    	 }
     }
     System.out.println(dp[n][v]);
     dp = new int[n + 1][v + 1];
     for(int i = 1;i <= v;i++) {
    	 dp[0][i] = -1;
     }
     for(int i = 1;i <= n;i++) {
    	 for(int j = 1;j <= v;j++) {
    		 dp[i][j] = dp[i - 1][j];
    		 if(j >= VI[i] && dp[i][j - VI[i]] != -1) {
    			 dp[i][j] = Math.max(dp[i][j],dp[i][j - VI[i]] + WI[i]);
    		 }
    	 }
     }
     System.out.println(dp[n][v] == -1 ? 0 : dp[n][v]);
     
 }
}
