package test2;







import java.util.*;
public class Main {
	public static void main(String[] args) {
		boolean[][] map = new boolean[10007][10007];
		Scanner in = new Scanner(System.in);
		long count = 0;
		int min = Integer.MAX_VALUE;
		int max = 0;
		int x1 = in.nextInt();
		
		int y1 = in.nextInt();
		
		int x2 = in.nextInt();
		
		int y2 = in.nextInt();
		
		int x3 = in.nextInt();
		
		int y3 = in.nextInt();
		
		int x4 = in.nextInt();
		
		int y4 = in.nextInt();
		long ans = 0;
		ans = (long)(y2 - y1) * (x2 - x1) + (long)(y4 - y3) * (x4 - x3);
		int yr = Math.min(y2, y4);
		int xr = Math.min(x2, x4);
		int yl = Math.max(y1, y3);
		int xl = Math.max(x1, x3);
		if(yr - yl > 0 && xr - xl > 0) {
			long tmp = (long)(yr - yl) * (xr - xl);//�г˻�����Ӽ�Ҫ�������ݷ�Χ��һ��ҪС��С��С��
			ans -= tmp;
		}
		System.out.println(ans);
		
	}

}
