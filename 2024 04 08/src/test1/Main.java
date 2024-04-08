package test1;




import java.util.*;
public class Main {
	public static void main(String[] args) {
		//1.创建 dp 表
		//2.初始化
		//3.填表
		//4.返回值
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int v = in.nextInt();
		int[] VI = new int[n + 1];
		int[] WI = new int[n + 1];
		for(int i = 1;i <= n;i++) {
			VI[i] = in.nextInt();
			WI[i] = in.nextInt();
		}
		int[][] dp = new int[n + 1][v + 1];
		for(int i = 1;i <= n;i++) {
			for(int j = 0;j <= v;j++) {
				dp[i][j] = dp[i - 1][j];
				if(j - VI[i] >= 0) {
					dp[i][j] = Math.max(dp[i][j], dp[i][j - VI[i]] + WI[i]);
				}
			}
		}
		System.out.println(dp[n][v]);
		dp = new int[n + 1][v + 1];
		for(int i = 1;i <= v;i++) {
			dp[0][i] = -1;
		}
		for(int i = 1;i <= n;i++) {
			for(int j = 0;j <= v;j++) {
				dp[i][j] = dp[i - 1][j];
				if(j - VI[i] >= 0 && dp[i][j - VI[i]] != -1) {
					dp[i][j] = Math.max(dp[i][j], dp[i][j - VI[i]] + WI[i]);
				}
			}
		}
		System.out.println(dp[n][v]);
		
		
	}

}
