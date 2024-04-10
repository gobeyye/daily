package test2;




import java.math.*;
public class Main {
	public static void main2(String[] args) {
		BigInteger sum = new BigInteger("0");
		BigInteger ret = new BigInteger("1");
		for(long i = 1;i <= 202320232023L;i++) {
			BigInteger tmp = BigInteger.valueOf(i);
			ret = ret.multiply(tmp);
			sum = sum.add(ret);
			System.out.println(sum);
		}
		System.out.println(sum);
	}
	public static void main4(String[] args) {
		long sum = 0;
		long ret = 1;
		for(long i = 1;i <= 100;i++) {
			ret = (i * ret) % 10000000000L;
			sum = (sum + ret) % 1000000000L;
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		System.out.println(420940313);
	}
	

}
