package test2;




public class Main {
	public static void main(String[] args) {
		int n = 23333333;
		//��Ҫ����0�ĸ�������������ֱ��ö��0�ĸ�������
		for(int i = 0;i < n / 2;i++) {
			int j = n - i;//1�ĸ���
			double a0 = 1.0 * i / n;
			double a1 = 1.0 * j / n;
		}
		
	}
	public static double log2(double x) {
		return Math.log(x) / Math.log(2);
	}

}
