package test3;





import java.util.*;
public class Main {
	public static void main(String[] args) {
		//1.���� dp ��
		//2.��ʼ��
		//3.���
		//4.����ֵ
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		//n == 1�Ѿ�����
		//ȫ����1��ʼ
		int[] nums = new int[n + 1];
		for(int i = 1;i <= n;i++) {
			nums[i] = in.nextInt();
		}
		int[][] Hg = new int[n + 1][2];
		for(int i = 1;i <= n- 1;i++) {
			Hg[i][0] = in.nextInt();
			Hg[i][1] = in.nextInt();
		}
		double[] f = new double[n + 1];//��ʾ����i - 1�ߵ� i���ߵ���i���ˣ�ĩ״̬���������ʱ��
		double[] g = new double[n + 1];//��ʾ�������ŵ���i���ˣ�ĩ״̬���������ʱ��
		f[1] = g[1] = nums[1];//�ߵ���һ����
		for(int i = 2;i <= n;i++) {//�ӵڶ����˿�ʼ
			//��ͼ��״̬ת�Ʒ���
			f[i] = Math.min(f[i - 1] + nums[i] - nums[i - 1],g[i - 1] + nums[i] - nums[i - 1] + Hg[i - 2][1] / 1.3);
			g[i] = f[i - 1] + Hg[i - 1][0] / 0.7;
			//i == 2���������if�е����ݲ�����
			if(i > 2) {
				if(Hg[i - 1][0] >= Hg[i - 2][1]) {
					g[i] = Math.min(g[i],g[i - 1] + (Hg[i - 1][0] - Hg[i - 2][1]) / 0.7);
				}else {
					g[i] = Math.min(g[i],g[i - 1] + (Hg[i - 2][1] - Hg[i - 1][0]) / 1.3);
				}
			}
		}
		//���������������ŵĻ���Ҫ������
		double ans = Math.min(f[n],g[n] + Hg[n - 1][1] / 1.3);
		System.out.printf("%.2f", ans);//������λС��
		
	}

}
