package test4;





import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n];
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			nums[i] = in.nextInt();
			arr[i] = nums[i];
		}
		int[] ans = new int[n];
		Arrays.sort(arr);
		int mid = n / 2;
		if(n % 2 != 0) {
			for(int i = 0;i < n;i++) {
				if(nums[i] < arr[mid]) {
					ans[i] = arr[mid] - nums[i] + 1;
				}else {
					ans[i] = 0;
				}
			}
		}else {
			for(int i = 0;i < n;i++) {
				if(nums[i] <= arr[mid]) {
					ans[i] = arr[mid + 1] - nums[i];
				}else {
					ans[i] = 0;
				}
			}
		}
		for(int i = 0;i < n;i++) {
			System.out.print(ans[i] + " ");
		}
	}

}
