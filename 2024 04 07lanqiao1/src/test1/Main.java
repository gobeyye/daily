package test1;




import java.util.*;
public class Main {
	static int n;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int[] ans = new int[2];
		int[][] nums = new int[n][2];
		for(int i = 0;i < n;i++) {
			nums[i][0] = in.nextInt();
			nums[i][1] = in.nextInt();
		}
		int right = Integer.MAX_VALUE;
		for(int i = 0;i < n;i++) {
			right = Math.min(right,nums[i][0] / nums[i][1]);
		}
		int left = 1;
		int minAns = 0;
		int preleft = 1;
		int preright = right;
		while(right > left) {/////////////rightºÍleft»á±ä
			int mid = left + (right -left) / 2;
			if(duo1(mid,nums)) {
				left = mid + 1;
			}else {
				right = mid;
			}
		}
		ans[0] = left;
		right = preright;
		left = 1;
		while(right > left) {
			int mid = left + (right - left + 1) / 2;
			if(duo2(mid,nums)) {
				left = mid;
			}else {
				right = mid - 1;
			}
		}
		ans[1] = left;
		for(int i = 0;i < 2;i++) {
			System.out.print(ans[i] + " ");
		}
		
//		System.out.println(left);
		
		
	}
	public static boolean duo1(int mid,int[][] nums) {
		for(int i = 0;i < n;i++) {
			if(nums[i][0] / mid > nums[i][1]) {
				return true;
			}
		}
		return false;
	}
	public static boolean duo2(int mid,int[][] nums) {
		for(int i = 0;i < n;i++) {
			if(nums[i][0] / mid >= nums[i][1]) {
				return true;
			}
		}
		return false;
	}

}
