package question2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-22
 * Time: 20:31
 */
import java.util.*;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    static long ret = 0;//枚举的长度
    static long path = 0;//出口数量
    static char[][] map;
    static int n,m;
    static long ans;//答案短路的长度
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //bfs 找对短路问题
        n = in.nextInt();m = in.nextInt();
        map = new char[n][];
        for(int i = 0;i < n;i++){
            map[i] = in.next().toCharArray();
        }
        //1.找开始位置
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(map[i][j] == 'k'){
                    //2.bfs 找对短路
                    bfs(i,j);
                }
            }
        }
        //4.没找到返回-1
        if(path == 0){
            System.out.println(-1);
        }else{
            //3.找到后记录别返回、返回最短路和能走到的出口数量
            System.out.println(path + " " + ans);
        }


    }
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    public static void bfs(int sr,int sc){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr,sc});
        while(!q.isEmpty()){
            ret++;
            int size = q.size();
            for(int i = 0;i < size;i++){
                int[] tmp = q.poll();
                int a = tmp[0],b = tmp[1];
                map[a][b] = '*';//直接在原来数组上修改，不用回溯
                for(int k = 0;k < 4;k++){
                    int x = a + dx[k];
                    int y = b + dy[k];
                    if(x >= 0 && x < n && y >= 0 && y < m && map[x][y] != '*'){
                        if(map[x][y] == 'e'){
                            path++;
                            if(path == 1){
                                ans = ret;
                            }
                            map[x][y] = '*';

                        }else{
                            map[x][y] = '*';
                            q.add(new int[]{x,y});
                        }
                    }
                }

            }

        }
    }
}
