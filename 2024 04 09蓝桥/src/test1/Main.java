package test1;










import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] nums = new int[100];
		for(int i = 0;i < 100;i++) {
			nums[i] = in.nextInt();
		}
		int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int count = 0;
		for(int i = 1;i <= 12;i++) {
			for(int j = 1;j <= month[i];j++) {
				int k = 0;
				int[] ask = {2,0,2,3,i / 10,i % 10,j / 10,j % 10};
				for(int x = 0;x < 100;x++) {
				    if(ask[k] == nums[x]) {
				    	k++;
				    }
				    if(k == 8) {
				    	count++;
				    	break;
				    }
				}
				
			}
		}
		System.out.println(count);
		
	}

}