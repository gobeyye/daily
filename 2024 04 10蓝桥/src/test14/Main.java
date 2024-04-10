package test14;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int MOD = 1000000007;
		while(T > 0) {
			int n = in.nextInt();
			int[] nums =  new int[n];
			long total = 0;
			for(int i = 0;i < n;i++) {
				nums[i] = in.nextInt();
				total += nums[i];
			}
			int count = 0;
			if(total % 2 == 0) {
				int[] f = new int[n + 1];
				int[] g = new int[n + 1];
				f[0] = 1;
				for(int i = 1;i <= n;i++) {
					if(nums[i - 1] % 2 == 0) {
						f[i] = 2 * f[i - 1] % MOD;
						g[i] = 2 * g[i - 1] % MOD;
					}else {
						f[i] = (f[i - 1] + g[i - 1]) % MOD;
						g[i] = (f[i - 1] + g[i - 1]) % MOD;
					}
				}
				System.out.println(f[n]);
				
			}else {
				System.out.println(0);
			}
			
			T--;
		}
		
	}

}
