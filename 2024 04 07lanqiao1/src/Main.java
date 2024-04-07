


import java.util.*;
public class Main {
	static int n;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
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
		while(right > left) {/////////////rightºÍleft»á±ä
			int mid = left + (right -left) / 2;
			if(duo(mid,nums)) {
				left = mid + 1;
			}else {
				right = mid;
			}
		}
		System.out.println(left);
		
		
	}
	public static boolean duo(int mid,int[][] nums) {
		for(int i = 0;i < n;i++) {
			if(nums[i][0] / mid > nums[i][1]) {
				return true;
			}
		}
		return false;
	}

}
