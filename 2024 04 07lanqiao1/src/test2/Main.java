package test2;





/*
 * import java.util.*; public class Main { public static void main(String[]
 * args) { //1.���� dp �� //2.��ʼ�� //3.��� //4.����ֵ Scanner in = new
 * Scanner(System.in); int n = in.nextInt(); int[] nums = new int[n]; int[] dp =
 * new int[n]; for(int i = 0;i < n;i++) { nums[i] = in.nextInt(); dp[i] = 1; }
 * for(int i = 1;i < n;i++) { for(int j = i - 1;j >= 0;j--) {
 * if(isCan(nums[j],nums[i])) { dp[i] = Math.max(dp[i],dp[j] + 1); } } } int max
 * = 0; for(int i = 0;i < n;i++) { max = Math.max(max,dp[i]); }
 * System.out.println(n - max);
 * 
 * 
 * //System.out.println(dp[n - 1]); } public static boolean isCan(int a,int b) {
 * //aǰ //b�� int ansA = a % 10; int ansB = 0; while(b != 0) { ansB = b % 10;
 * b/=10; } return ansA == ansB; }
 * 
 * }
 */


import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] dp = new int[10];
		int m = 0;//java�б���Ҫ�����ʼֵ
		for(int i = 0;i < n;i++) {
			String s = in.next();
			int x = (int)(s.charAt(0) - '0');
			int y = (int)(s.charAt(s.length() - 1) - '0');
			dp[y] = Math.max(dp[y],dp[x] + 1);
			m = Math.max(m, dp[y]);
		}
		System.out.println(n - m);
	}
}