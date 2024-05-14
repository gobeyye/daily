//package boke1;
//
///**
// * Created with IntelliJ IDEA.
// * Description:
// * User: HXL
// * Date: 2024-05-14
// * Time: 10:35
// */
//
//public class Main {
//    public void bfs(char[][] grid, int i, int j) {
//        Queue<int[]> queue = new LinkedList<>();
//        queue.add(new int[] { i, j });
//        while (!queue.isEmpty()) {
//            int[] tmp = queue.poll();
//            int a = tmp[0];
//            int b = tmp[1];
//            vis[a][b] = true;///////////////////1
//            for (int k = 0; k < 4; k++) {
//                int x = a + dx[k];
//                int y = b + dy[k];
//                if(x >= 0 && x < n && y >= 0 && y < m && !vis[x][y]){
//                    queue.add(new int[]{x,y});
//                    vis[x][y] = true;///////////////////////2
//                }
//            }
//        }
//    }
//    static int[] dx = {-1,-1,-1,0,0,1,1,1};
//    static int[] dy = {-1,0,1,-1,1,-1,0,1};
//    public static void main(String[] args) {
//        for(int k = 0;k < 4;k++){
//            int x = i + dx[k];
//            int y = j + dy[k];
//        }
//    }
//
//}
