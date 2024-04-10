package test1;






import java.util.*;
public class Main {
	static int[] nums;
	static int count;
	static int n;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T > 0) {
			n = in.nextInt();
			nums =  new int[n];
			int total = 0;
			for(int i = 0;i < n;i++) {
				nums[i] = in.nextInt();
				total += nums[i];
			}
			if(total % 2 == 0) {
				count = 0;
				dfs(0,0);
				System.out.println(count);
			}else {
				System.out.println(0);
			}
			
			
			T--;
		}
		
	}
	public static void dfs(int step,int sum) {
		if(step == n) {
			if(sum % 2 == 0) {
				count++;
				count %= 1000000007;
			}
			return;
		}
		dfs(step + 1,sum + nums[step]);
		dfs(step + 1,sum);
	}

}
