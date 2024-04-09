package test2;




public class Main {
	public static void main(String[] args) {
		int n = 23333333;
		//答案要的是0的个数，所以我们直接枚举0的个数即可
		for(int i = 0;i < n / 2;i++) {
			int j = n - i;//1的个数
			double a0 = 1.0 * i / n;
			double a1 = 1.0 * j / n;
		}
		
	}
	public static double log2(double x) {
		return Math.log(x) / Math.log(2);
	}

}
