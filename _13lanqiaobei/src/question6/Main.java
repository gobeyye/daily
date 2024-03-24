package question6;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-24
 * Time: 23:14
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] map = new int[n][m];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                map[i][j] = in.nextInt();
            }
        }
        int limit = in.nextInt();
        int maxAns = 0;
        int maxMap = Integer.MIN_VALUE;
        int minMap = Integer.MAX_VALUE;
        for(int row = 0;row < n;row++){
            for(int col = 0;col < m;col++){


            }
        }

    }
}
