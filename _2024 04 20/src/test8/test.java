package test8;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-20
 * Time: 15:18
 */
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            int[][] map = new int[9][9];
            for(int i = 0;i < 9;i++){
                for(int j = 0;j < 9;j++){
                    map[i][j] = in.nextInt();
                }
            }
            //找行
            boolean key = true;
            for(int i = 0;i < 9;i++){
                Set<Integer> set = new HashSet<>();
                for(int j = 0;j < 9;j++){
                    if(set.contains(map[i][j])){
                        key = false;
                        System.out.println(0);
                        break;
                    }
                    set.add(map[i][j]);
                }
                if(key == false){
                    break;
                }
            }
            //找列
            if(key == true){
                for(int i = 0;i < 9;i++){
                    Set<Integer> set = new HashSet<>();
                    for(int j = 0;j < 9;j++){
                        if(set.contains(map[j][i])){
                            key = false;
                            System.out.println(0);
                            break;

                        }
                        set.add(map[j][i]);
                    }
                    if(key == false){
                        break;
                    }
                }
            }
            if(key == true){
                System.out.println(1);
            }



    }
}
