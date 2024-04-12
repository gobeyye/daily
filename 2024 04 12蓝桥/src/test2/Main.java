package test2;






import java.util.*;
public class Main {
	static int max;
	static int n;
	static int m;
	static int[] item;
	static int[][] menpiao;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();m = in.nextInt();
		item = new int[m];
		menpiao = new int[m][2];
		for(int i = 0;i < m;i++) {
			menpiao[i][0] = in.nextInt();
			menpiao[i][1] = in.nextInt();
		}
		dfs(0);
		System.out.println(max);
	}
	public static void dfs(int path) {
		if(path == n) {
			int sum = 0;
			for(int i = 0;i < m;i++) {
				int Hx = Math.max(menpiao[i][0] * item[i] + menpiao[i][1], 0) * item[i];
				sum += Hx;
			}
			max = Math.max(max, sum);
			return;
		}
		for(int i = 0;i < m;i++) {
			item[i]++;
			dfs(path + 1);
			item[i]--;
		}
		dfs(path + 1);
	}
}
