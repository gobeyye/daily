package test2;





public class Main {
	public static void main(String[] args) {
		System.out.println(3138);
	}
	public static void main4(String[] args) {
		long count = 0;
		for(long i = 2022;i <= 2022222022L;i++) {
			if(isHuiwen(i)) {
				count++;
				System.out.println(i);
			}
			
		}
		System.out.println(count);
	}
//	public static void main(String[] args) {
//		long count = 0;
//		System.out.println(isHuiwen(123565321));
//		System.out.println(isHuiwen(145541));
//		System.out.println(isHuiwen(54645));
//		//System.out.println(count);
//	}
	public static boolean isHuiwen(long n) {
		String ss = "" + n;
		char[] s = ss.toCharArray();
		int right = s.length - 1;
		int left = 0;
		while(right > left) {
			if(s[right] != s[left]) {
				return false;
			}
			if(s[left] > s[left + 1] && left + 1 < right) {
				return false;
			}
			right--;
			left++;
		}
		
		return true;
	}

}
