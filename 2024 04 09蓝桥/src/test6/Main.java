package test6;




import java.util.*;
public class Main {
	//前缀和优化 
	//把时间复杂度降到O（n）
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		String s = in.next();
		char c1 = in.next().charAt(0);
		char c2 = in.next().charAt(0);
		int n = s.length();
		long count = 0;
		int[] dp = new int[n];
		for(int i = 0;i < n;i++) {
			if(s.charAt(i) == c1) {
				dp[i]++;
			}
			if(i != 0 ) {
				dp[i] += dp[i - 1];
			}
		}
		for(int i = 0;i < n;i++) {
			if(s.charAt(i) == c2 && i - k + 1>= 0) {
				count += dp[i - k + 1];
			}
		}
		System.out.println(count);
	}
	//暴力
	public static void main1(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		String s = in.next();
		char c1 = in.next().charAt(0);
		char c2 = in.next().charAt(0);
		int n = s.length();
		int count = 0;
		for(int i = 0;i < n;i++) {
			if(s.charAt(i) != c1) {
				continue;
			}
			for(int j = i + 1;j < n;j++) {
				if(s.charAt(j) == c2 && j - i + 1>= k) {
					count++;
				}
			}
		}
		System.out.println(count);
		
	}

}
