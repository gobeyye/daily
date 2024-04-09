package test10;





import java.util.*;
public class Main {
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	static int max;
	static boolean[][] vis;
	static char[][] map;
	static int path;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		map = new char[30][60];
		vis = new boolean[30][60];
		for(int i = 0;i < 30;i++) {
			map[i] = in.next().toCharArray();
		}
		for(int i = 0;i < 30;i++) {
			for(int j = 0;j < 60;j++) {
				if(map[i][j] == '1' && !vis[i][j]) {
					path = 0;
					dfs(i,j);
					max = Math.max(max, path);
				}
				
			}
		}
		System.out.println(max);
	}
	public static void dfs(int i,int j) {
		vis[i][j] = true;
		path++;
		for(int k = 0;k < 4;k++) {
			int x = i + dx[k];
			int y = j + dy[k];
			if(x >= 0 && x < 30 && y >= 0 && y < 60 && map[x][y] == '1' && !vis[x][y]) {
				dfs(x,y);
			}
		}
	}

}
