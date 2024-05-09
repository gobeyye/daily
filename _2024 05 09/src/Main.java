import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] map = new int[n][n];
        int c = 1;
        int l = 0,r = n - 1;
        while(r >= l){
            for(int k = l;k <= r;k++){
                map[l][k] = c++;
            }
            for(int k = l + 1;k <= r;k++){//去头
                map[k][r] = c++;
            }
            for(int k = r - 1;k >= l;k--){//去头
                map[r][k] = c++;
            }
            for(int k = r - 1;k > l;k--){//要去头去尾
                map[k][l] = c++;
            }
            l++;
            r--;
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}