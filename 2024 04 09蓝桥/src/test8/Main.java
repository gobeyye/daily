package test8;



import java.util.*;
public class Main {
 public static void main(String[] args) {
	 //1.���� dp ��
	 //2.��ʼ��
	 //3.���
	 //4.����ֵ
	 Scanner in = new Scanner(System.in);
	 String s = in.next();
	 int n = s.length();
	 s = " " + s;
	 
	 long[] dp = new long[n + 1];
	 for(int i = 2;i <= n;i++) {
		 if(s.charAt(i) == s.charAt(i - 1) || s.charAt(i) == '?' || s.charAt(i - 1) == '?') {
			 dp[i] = dp[i - 2] + 1;
		 }else {
			 dp[i] = dp[i - 1];
		 }
	 }
	 System.out.println(dp[n]);
	 
      
 }
}