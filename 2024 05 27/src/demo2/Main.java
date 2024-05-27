package demo2;






import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(),k = in.nextInt();
		long[] nums = new long[n];
		
		
		//3.����С����
		PriorityQueue<Long> heap = new PriorityQueue<>();
		
		long sum = 0;
		
		for(int i = 0;i < n;i++) {
			//1.���
			nums[i] = in.nextLong();
			sum += nums[i];
			heap.add(nums[i]);
		}
		//2.�ж��ǲ��� k �ı���
		if(sum % k == 0) {
			System.out.println(sum);
			return;
		}
		//4.ģ�⣬�ж�
		while(!heap.isEmpty()) {
			sum -= heap.poll();
			if(sum % k == 0) {
				System.out.println(sum);
				return;
			}
		}
		System.out.println(-1);
		
	}

}
