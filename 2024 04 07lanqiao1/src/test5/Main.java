package test5;










import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		int count = 0;
		for(long i = 2022;i <= 2022222022L;i++) {
			if(ishui(i)) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println(count);
//		boolean a = ishui(1331);
//		boolean b = ishui(13531);
//		System.out.println(a);
//		System.out.println(b);
		
	}
	public static boolean ishui(long n) {
		String s = n + "";
		int left = 0;
		int right = s.length() - 1;
		while(right > left) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			if(s.charAt(left + 1) - s.charAt(left) < 0 && right - 1 != left) {
				return false;
			}
			right--;
			left++;
		}
		return true;
		
	}

}
