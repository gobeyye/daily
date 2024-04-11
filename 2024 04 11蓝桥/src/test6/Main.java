package test6;





import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Integer[] nums = new Integer[n];
		for(int i = 0;i < n;i++) {
			nums[i] = in.nextInt();
		}
		Arrays.sort(nums,(o1,o2)->o2 - o1);
		int fast = 1,slow = 0;
		while(fast < n && slow < n) {
			int min = Math.min(nums[fast],nums[slow]);
			int mid = min / 2;
			for(int i = fast;i < n;i++) {
				if(nums[i] != 0 && nums[i] <= mid) {
					nums[i] = 0;
					break;
				}
			}
			int co = 2;
			while(co > 0) {
				fast++;
				if(fast >= n) {
					break;
				}
				if(nums[fast] != 0) {
					co--;
				}
			}
			co = 2;
			while(co > 0) {
				slow++;
				if(slow >= n) {
					break;
				}
				if(nums[slow] != 0) {
					co--;
				}
			}
		}
		long sum = 0;
		for(int x:nums) {
			sum += x;
		}
		System.out.println(sum);
		
		
	}

}
