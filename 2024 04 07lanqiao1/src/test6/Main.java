package test6;








import java.util.*;
public class Main {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		String s = "0100110001010001";
		for(int i = 0;i < s.length();i++) {
			set.add(s.substring(i,i + 1));
			for(int j = i + 1;j < s.length();j++) {
				set.add(s.substring(i,j + 1));
			}
		}
		int k = set.size();
		System.out.println(k);
	}

}
