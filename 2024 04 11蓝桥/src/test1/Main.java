package test1;





public class Main {
	public static void main(String[] args) {
		System.out.println(215040);
	}
	public static void main2(String[] args) {
		int count = 0;
		for(long i = 1;;i++) {
			if(isJinzhi(i,2) && isJinzhi(i,8) && isJinzhi(i,10) && isJinzhi(i,16)) {
				count++;
				System.out.println(i);
				if(count == 10) {
					break;
				}
			}
		}
		
	}
	public static void main5(String[] args) {
		int count = 0;
		for(long i = 1;;i++) {
			if(isJinzhi(i,2) && isJinzhi(i,8) && isJinzhi(i,10) && isJinzhi(i,16)) {
				count++;
				if(count == 2023) {
					System.out.println(i);
					return;
				}
			}
		}
		
		
	}
	public static boolean isJinzhi(long n,long di) {
		long sum = 0;
		long tmp = n;
		while(n != 0) {
			sum += n % di;
			n /= di;
		}
		return tmp % sum == 0 ? true : false;
	}

}
