package test1;





import java.util.*;
class Stone{
	int val;
	int color;
	public Stone(int val,int color) {
		this.val = val;
		this.color = color;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Stone[] stones = new Stone[n]; 
		int[] nums = new int[n];
		int[] colo = new int[n];
		
		for(int i = 0;i < n;i++) {
			nums[i] = in.nextInt();
		}
		for(int i = 0;i < n;i++) {
			colo[i] = in.nextInt();
		}
		for(int i = 0;i < n;i++) {
			Stone sto = new Stone(nums[i],colo[i]);
			stones[i] = sto;
		}
		Stack<Stone> stack = new Stack<>();
		int sum = 0;
		boolean key = false;
		while(true) {
			key = false;
			for(int i = 0;i < n;i++) {
				if(!stack.isEmpty()) {
					if(stack.peek().color == stones[i].color) {
						stack.peek().color = (stack.peek().color + 1) % 3;
						stack.peek().val = stack.peek().val + stones[i].val;
						sum += stack.peek().val;
						key = true;
					}else {
						stack.push(stones[i]);
					}
				}else {
					stack.push(stones[i]);
				}
			}
			n = stack.size();
			stones = new Stone[n];
			int j = 0;
			while(!stack.empty()) {
				stones[j++] = stack.pop();
			}
			if(key == false) {
				break;
			}
		}
		System.out.println(n + " " + sum);
	}

}
