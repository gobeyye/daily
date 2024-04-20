package test9;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-20
 * Time: 15:37
 */





import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),m = in.nextInt();
        int[][] map = new int[n][];
        for(int i = 0;i < n;i++){
            int k = in.nextInt();
            int[] submpa = new int[k];
            for(int j = 0;j < k;j++){
                submpa[j] = in.nextInt();
            }
            map[i] = submpa;
        }
        int Q = in.nextInt();
        while(Q > 0){
            int x = in.nextInt(),y = in.nextInt();
            int count = 0;
//            boolean key1 = false,key2 = false;
            for(int i = 0;i < n;i++){
                boolean key1 = false,key2 = false;
                for(int j = 0;j < map[i].length;j++){
                    if(map[i][j] == x){
                        key1 = true;
                    }
                    if(map[i][j] == y){
                        key2 = true;
                    }
                }
                if(key1 == true && key2 == true) {
                    count++;
                }
            }
            System.out.println(count);
            Q--;
        }

    }
}
