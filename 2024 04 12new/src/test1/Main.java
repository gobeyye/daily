package test1;





public class Main {
	public static void main(String[] args) {
		System.out.println(7);
	}
	public static void main2(String[] args) {
		long a = 1;
		for(int i = 1;i <= 22;i++) {
			a = (a * 20) % 7;
		}
		System.out.println(a);
	}

}
