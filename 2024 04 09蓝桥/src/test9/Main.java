package test9;





import java.util.*;
public class Main {
	static String s;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		s = in.next();
		long count = 0;
		int n = s.length();
		for(int i = 0;i < n;i++) {
			for(int j = i + 1;j < n;j++) {
				if(isDayu(i,j)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static boolean isDayu(int left,int right) {
		boolean ans = false;
		while(right > left) {
			if(s.charAt(left) > s.charAt(right)) {
				return true;
			}
			if(s.charAt(left) < s.charAt(right)) {
				return false;
			}
			right--;
			left++;
		}
		return false;
	}

}
