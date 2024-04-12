package test6;





import java.util.*;
class graph{
	int[] arrayV;
	int[][] matrix;
	int sum;
	int sum1;
	int k;
	int count = 0;
	public graph(int size,int k) {
		arrayV = new int[size];
		matrix = new int[size][size];
		this.k = k;
		for(int i = 0;i < size;i++) {
			arrayV[i] = i;
		}
		for(int i = 0;i < size;i++) {
			Arrays.fill(matrix[i], -1);
		}
	}
	public void addEdge(int index1,int index2,int weight) {
		matrix[index1][index2] = weight;
		matrix[index2][index1] = weight;
	}
	public void dfs(int index) {
		boolean[] vis = new boolean[arrayV.length];
		dfsChild(index,vis);
		
	}
	public void dfsChild(int index,boolean[] vis) {
		//System.out.print(arrayV[index]+ " : "+ "-> " );
		vis[index] = true;
		for(int i = 0;i < arrayV.length;i++) {
			if(matrix[index][i] != -1 && !vis[i]) {
				sum += matrix[index][i];
				count++;
				if(count <= k) {
					sum1 += matrix[index][i];
				}
				dfsChild(i,vis);
			}
		}
	}
	public int getSum() {
		return sum - sum1;
	}
	
}
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(),k = in.nextInt(),m = in.nextInt();
		graph gp = new graph(n,k);
		for(int i = 0;i < m;i++) {
			int a = in.nextInt(),b = in.nextInt(),c = in.nextInt();
			gp.addEdge(a,b,c);
		}
		gp.dfs(0);
		int sum = gp.getSum();
		System.out.println(sum);		
	}

}
