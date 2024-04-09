package test3;







import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] ss = new String[520];
		for(int i = 0;i < 520;i++) {
			ss[i] = in.nextLine();
		}
		Arrays.sort(ss,(o1,o2)->o1.compareTo(o2));
		for(int i = 0;i < 520;i++) {
			System.out.println(ss[i]);
		}
		
	}

}
