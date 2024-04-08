package test7;

public class Main {
	public static void main(String[] args) {
		int count = 20190324 - 3;
		int a = 1;
		int b = 1;
		int c = 1;
		int d = 0;
		while(count > 0) {
			d = a + b + c;
			d = d % 10000;
			a = b;
			b = c;
			c = d;
			count--;
		}
		System.out.println(d);
	}

}
