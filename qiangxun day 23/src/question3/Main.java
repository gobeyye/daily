package question3;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-10
 * Time: 21:20
 */
//解法1：离谱的解法DFS
//public class Main {
//
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     *
//     * @param m int整型ArrayList<ArrayList<>>
//     * @return int整型
//     */
//    public static int ret = 0;
//    static int[][] map;
//    static int[] dx = {0,0,1,-1};
//    static int[] dy = {1,-1,0,0};
//    static int n;
//    public int citys (ArrayList<ArrayList<Integer>> m) {
//        n = m.size();
//        //1.转成数组
//        map = new int[n][n];
//        for(int i = 0;i < n;i++){
//            for(int j = 0;j < n;j++){
//                map[i][j] = m.get(i).get(j);
//            }
//        }
//        //2.DFS找个数
//        for(int i = 0;i < n;i++){
//            for(int j = 0;j < n;j++){
//                if(map[i][j] == 1){
//                    dfs(i,j);
//                    ret++;
//                }
//            }
//        }
//        return ret;
//        // write code here
//    }
//    public static void dfs(int i,int j){
//        map[i][j] = 2;
//        for(int k = 0;k < 4;k++){
//            int x = i + dx[k];
//            int y = j + dy[k];
//            if(x >= 0 && x < n && y >= 0 && y < n && map[x][y] == 1){
//                dfs(x,y);
//            }
//        }
//
//    }
//}
