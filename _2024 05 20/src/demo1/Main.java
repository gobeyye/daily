//package demo1;
//import java.util.*:
///**
// * Created with IntelliJ IDEA.
// * Description:
// * User: HXL
// * Date: 2024-05-20
// * Time: 8:43
// */
//public class Main {
//    public int bfs(char[][] map,int sr,int sc,int er,int ec){
//        Queue<int[]> queue = new LinkedList<>();
//        queue.offer(new int[]{sr,sc});//先放入起点
//        int path = 0;//记录路径长度
//        while(!queue.isEmpty()){
//            int size = queue.size();
//            path++;//向外扩展一层
//            for(int i = 0;i < size;i++){
//                int[] tmp = queue.poll();
//                int a = tmp[0],b = tmp[1];
//                vis[a][b] = true;
//                for(int k = 0;k < 4;k++){
//                    int x = a + dx[k];
//                    int y = b + dy[k];
//                    if(x >= 0 && x < n && y >= 0 && y < m && 题目对应条件 &&
//                            !vis[x][y]){
//                        if(达到出口条件){
//                            return path;//返回
//                        }
//                        queue.offer(new int[]{x,y});
//                        vis[x][y] = true;
//                    }
//                }
//            }
//
//        }
//        return -1;//没找到的情况，具体返回什么看题目
//    }
//}
