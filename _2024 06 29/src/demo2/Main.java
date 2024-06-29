package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-29
 * Time: 10:17
 */
import java.util.*;
public class Main {
    static int n,m,x,y;
    static int[][] map;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();m = in.nextInt();
        x = in.nextInt();y = in.nextInt();
        map = new int[n + 1][m + 1];//-1 表示没有填过
        for(int i = 1;i <= n;i++){
            Arrays.fill(map[i],-1);
        }
        map[x][y] = 0;//方便写代码
        bfs(x,y);
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= m;j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[] dx = {1,-1,-2,-2,-1,1,2,2};
    static int[] dy = {-2,-2,-1,1,2,2,1,-1};
    public static void bfs(int x1,int y1){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x1,y1});
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0;i < size;i++){
                int[] tmp = q.poll();
                int a = tmp[0],b = tmp[1];
                for(int k = 0;k < 8;k++){
                    int row = a + dx[k];
                    int col = b + dy[k];
                    if(row >= 1 && row <= n && col >= 1 && col <= m && map[row][col] == -1){
                        map[row][col] = map[a][b] + 1;
                        q.add(new int[]{row,col});
                    }
                }
            }
        }


    }
}
