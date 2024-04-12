package test3;





import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int[] hash = new int[26];
		for(int i = 0;i < s.length();i++) {
			int index = (int)(s.charAt(i) - 'A');
			hash[index]++;
		}
		int max = 0;
		for(int i = 0;i < 26;i++) {
			max = Math.max(max, hash[i]);
		}
		for(int i = 0;i < 26;i++) {
			if(hash[i] == max) {
				char ch = (char)(i + 'A');
				System.out.print(ch);
			}
		}
	}

}
