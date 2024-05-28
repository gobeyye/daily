package question9;





//import java.util.*;
//class Node{
//	public int val;
//	public Node left;
//	public Node right;
//	public Node() {
//		
//	}
//	public Node(int x) {
//		this.val = x;
//	}
//	
//}
//public class Main {
//	static int n,k;
//	static Node head;
//	static int count = 0;
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		n = in.nextInt();k = in.nextInt();
//		head = new Node(1);
//		dfs(head,1);
////		System.out.println(count);
//	}
//	public static void dfs(Node root,int step) {
//		if(step == n) {
//			count++;
//			System.out.println();
//			PrevOrder(head);//前序遍历
//			return;
//		}
//		if(step > n) {
//			return;
//		}
//		root.left = new Node(step + 1);
//		dfs(root.left,step + 1);
////		root.left = null;
//		root.right = new Node(step + 2);
//		dfs(root.right,step + 2);
//		root.left = null;//回溯
//		root.right = null;
//		root.right = new Node(step + 1);
//		dfs(root.right,step + 1);
//		root.right = null;
//	}
//	public static void PrevOrder(Node root) {
//		if(root == null) {
//			return;
//		}
//		System.out.print(root.val + " ");
//		PrevOrder(root.left);
//		PrevOrder(root.right);
//	}
//
//}







//树形dp
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(),k = in.nextInt();
		long[][] dp = new long[50][50];
		dp[0][0] = dp[1][1] = 1;
		for(int i = 2;i <= n;i++) {
			for(int x = 0;x <= i - 1;x++) {
				int y = i - x - 1;
				for(int c = 0;c <= x;c++) {
					for(int d = 0;d <= y;d++) {
						if(Math.max(c, d) >= k * Math.min(c,d)) {
							dp[i][Math.max(c,d) + 1] += dp[x][c] * dp[y][d];
						}
						
						
					}
				}
			}
		}
		long ret = 0;
		for(int i = 0;i <= n;i++) {
			ret += dp[n][i];
		}
		System.out.println(ret);
	}
}







