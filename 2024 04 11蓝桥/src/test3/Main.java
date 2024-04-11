package test3;





import java.util.*;
public class Main {
	public static void main(String[] args) {
		//1.创建 dp 表
		//2.初始化
		//3.填表
		//4.返回值
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		//n == 1已经包含
		//全都从1开始
		int[] nums = new int[n + 1];
		for(int i = 1;i <= n;i++) {
			nums[i] = in.nextInt();
		}
		int[][] Hg = new int[n + 1][2];
		for(int i = 1;i <= n- 1;i++) {
			Hg[i][0] = in.nextInt();
			Hg[i][1] = in.nextInt();
		}
		double[] f = new double[n + 1];//表示（从i - 1走到 i）走到第i根杆（末状态）所需最短时间
		double[] g = new double[n + 1];//表示坐传送门到第i根杆（末状态）所需最短时间
		f[1] = g[1] = nums[1];//走到第一根杆
		for(int i = 2;i <= n;i++) {//从第二根杆开始
			//作图找状态转移方程
			f[i] = Math.min(f[i - 1] + nums[i] - nums[i - 1],g[i - 1] + nums[i] - nums[i - 1] + Hg[i - 2][1] / 1.3);
			g[i] = f[i - 1] + Hg[i - 1][0] / 0.7;
			//i == 2的情况下面if中的内容不存在
			if(i > 2) {
				if(Hg[i - 1][0] >= Hg[i - 2][1]) {
					g[i] = Math.min(g[i],g[i - 1] + (Hg[i - 1][0] - Hg[i - 2][1]) / 0.7);
				}else {
					g[i] = Math.min(g[i],g[i - 1] + (Hg[i - 2][1] - Hg[i - 1][0]) / 1.3);
				}
			}
		}
		//最后如果是做传送门的话还要爬下来
		double ans = Math.min(f[n],g[n] + Hg[n - 1][1] / 1.3);
		System.out.printf("%.2f", ans);//保留两位小数
		
	}

}
