package test5;






import java.util.*;
public class Main {
	static int count1;
	static int count2;
	static int max1;
	static int max2;
	static boolean[][] vis;
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static int n;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int[][] map1 = new int[n + 1][n + 1];
		int[][] map2 = new int[n + 1][n + 1];
		for(int i = 1;i <= n;i++) {
			for(int j = 1;j <= n;j++) {
				map1[i][j] = in.nextInt();
			}
		}
		for(int i = 1;i <= n;i++) {
			for(int j = 1;j <= n;j++) {
				map2[i][j] = in.nextInt();
			}
		}
		for(int i = 1;i <= n;i++) {
			if(map1[1][i] == 1) {
				count1 = 0;
				vis = new boolean[n + 1][n + 1];
				dfs(map1,1,i);
				max1 = Math.max(max1, count1);
			}
			if(map1[n][i] == 1) {
				count1 = 0;
				vis = new boolean[n + 1][n + 1];
				dfs(map1,n,i);
				max1 = Math.max(max1, count1);
			}
			if(map1[i][1] == 1) {
				count1 = 0;
				vis = new boolean[n + 1][n + 1];
				dfs(map1,i,1);
				max1 = Math.max(max1, count1);
			}
			if(map1[i][n] == 1) {
				count1 = 0;
				vis = new boolean[n + 1][n + 1];
				dfs(map1,i,n);
				max1 = Math.max(max1, count1);
			}
			
		}
		for(int i = 1;i <= n;i++) {
			if(map2[1][i] == 1) {
				count2 = 0;
				vis = new boolean[n + 1][n + 1];
				dfs(map2,1,i);
				max2 = Math.max(max2, count2);
			}
			if(map2[n][i] == 1) {
				count2 = 0;
				vis = new boolean[n + 1][n + 1];
				dfs(map2,n,i);
				max2 = Math.max(max2, count2);
			}
			if(map2[i][1] == 1) {
				count2 = 0;
				vis = new boolean[n + 1][n + 1];
				dfs(map2,i,1);
				max2 = Math.max(max2, count2);
			}
			if(map2[i][n] == 1) {
				count2 = 0;
				vis = new boolean[n + 1][n + 1];
				dfs(map2,i,n);
				max2 = Math.max(max2, count2);
			}
			
		}
		
		System.out.println(max1 + max2);
		
	}
	public static void dfs(int[][] map,int i,int j) {
		count1++;
		count2++;
		vis[i][j] = true;
		for(int k = 0;k < 4;k++) {
			int x = i + dx[k];
			int y = j + dy[k];
			if(x >= 1 && x <= n && y >= 1 && y <= n && map[x][y] == 1 && !vis[x][y]) {
				dfs(map,x,y);
			}
		}
		
	}
}
