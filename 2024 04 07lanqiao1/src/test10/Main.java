package test10;






//20:42



import java.util.*;
public class Main {
	static char[][] map;
	static int dx1[] = {-1,-1,-1,0,0,1,1,1};
	static int dy1[] = {-1,0,1,-1,1,-1,0,1};
	static int dx2[] = {1,-1,0,0};
	static int dy2[] = {0,0,1,-1};
	static int n;
	static int m;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T > 0) {
			int count = 0;
			n = in.nextInt();
			m = in.nextInt();
			map = new char[52][52];
			for(int i = 0;i <= n + 1;i++) {
				Arrays.fill(map[i], '0');
			}
			for(int i = 0;i < n;i++) {
				String s = in.next();
				for(int j = 0;j < m;j++) {
					map[i + 1][j + 1] = s.charAt(j);
				}	
			}
			dfs_sear(0,0);
			for(int i = 1;i <= n;i++) {
				for(int j = 1;j <= m;j++) {
					if(map[i][j] == '1') {
						for(int k = 0;k < 8;k++) {
							int x = i + dx1[k];
							int y = j + dy1[k];
							if(x >= 0 && x <= n + 1 && y >= 0 && y <= m + 1
									&& map[x][y] == '2') {
								dfs_dao(i,j);
								count++;
								break;
							}
						}
							
					}
				}
			}
			System.out.println(count);
			
			T--;
		}
	}
	

	
	
	
	public static void dfs_sear(int i,int j) {
		map[i][j] = '2';
		for(int k = 0;k < 8;k++) {
			int x = i + dx1[k];
			int y = j + dy1[k];
			if(x >= 0 && x <= n + 1 && y >= 0 && y <= m + 1 && map[x][y] == '0') {
				dfs_sear(x,y);
			}
		}
	}
	public static void dfs_dao(int i,int j) {
		map[i][j] = '3';
		for(int k = 0;k < 4;k++) {
			int x  =i + dx2[k];
			int y = j + dy2[k];
			if(x >= 1 && x <= n && y >= 1 && y <= m && map[x][y] == '1') {
				dfs_dao(x,y);
			}
		}
	}

}
