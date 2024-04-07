package test3;





import java.util.*;
public class Main {
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static int[] dx1 = {0,0,1,-1,-1,1,-1,1};
	static int[] dy1 = {1,-1,0,0,-1,-1,1,1};
	static int count;
	static char[][] map;
	static int n;
	static int m;
	public static void main(String[] args) {
		//填地图
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i = 0;i < T;i++) {
			n = in.nextInt();
			m = in.nextInt();
			map = new char[n][m];
			for(int j = 0;j < n;j++) {
				String s = in.next();
				map[j] = s.toCharArray();
			}
			
			int count = 0;
			//标记外海
			for(int k = 0;k < n;k++) {
				if(map[k][0] == 0) {
					dfs_sear(k,0);
				}
				if(map[k][m - 1] == 0) {
					dfs_sear(k,m - 1);
				}
				
			}
			for(int k = 0;k < m;k++) {
				if(map[0][k] == 0) {
					dfs_sear(0,k);
				}
				if(map[n - 1][k] == 0) {
					dfs_sear(n - 1,k);
				}
			}
			//查找与外海相连接的岛屿个数
			for(int j = 0;j < n;j++) {
				for(int k = 0;k < m;k++) {
					if(map[j][k] == 1 && (map[j - 1][k] == 2 || (j -1) < 0 || (j - 1) >= n) ) {
						count++;
						dfs_dao(j,k);
					}
				}
			}
			System.out.println(count);
			
		}
	}
	public static void dfs_dao(int i,int j) {
		map[i][j] = 3;
		for(int k = 0;k < 4;k++) {
			int x = i + dx[k];
			int y = j + dy[k];
			if(x >= 0 && x < n && y >= 0 && y < m && map[x][y] == 1) {
				dfs_dao(x,y);
			}
		}
	}
	public static void dfs_sear(int i,int j) {
		map[i][j] = 2;
		for(int k = 0;k < 8;k++) {
			int x = i + dx1[k];
			int y = j + dy1[k];
			if(x >= 0 && x < n && y >= 0 && y < m && map[x][y] == 0) {
				dfs_sear(x,y);
			}
		}
		
	}

}
