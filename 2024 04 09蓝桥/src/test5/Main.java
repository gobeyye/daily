package test5;










public class Main {
	public static void main(String[] args) {
		System.out.println(2730);
	}
	public static void main3(String[] args) {
		for(int i = 2023;;i++) {
			if(isT(i)) {
				System.out.println(i);
				return;
			}
		}
	}
	public static boolean isT(int n) {
		int tmp = 0;
		while(n != 0) {
			tmp = n % 16;
			n /= 16;
			if(tmp <10) {
				return false;
			}
		}
		return true;
	}

}
