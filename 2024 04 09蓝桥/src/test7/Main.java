package test7;

public class Main {
	static long count;
	public static void main2(String[] args) {
		System.out.println(8335366);
	}
	public static void main(String[] args) {
		dfs(0,0);
		System.out.println(count);
	}
	public static void dfs(int path,int step) {
		if(path == 70) {
			count++;
		}
		if(step == 30 || path == 100) {
			return;
		}
		dfs(path + 10,step + 1);
		//¥Ú¥ÌπÈ¡„
		dfs(0,step + 1);
	}

}
