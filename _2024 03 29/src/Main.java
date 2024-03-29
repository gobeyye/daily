/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    int[] dx = {0,0,1,-1,-1,-1,1,1};
    int[] dy = {1,-1,0,0,-1,1,-1,1};
    boolean[][] vis;
    int n,m;
    public char[][] updateBoard(char[][] board, int[] click) {
        n = board.length;
        m = board.length;
        vis = new boolean[n][m];
        int x = click[0];
        int y = click[1];
        int count = fiddilei(board,x,y);
        if(board[x][y] == 'M'){
            board[x][y] = 'X';
            return board;
        }else if(board[x][y] == 'E' && count == 0){
            dfs(board,x,y);

        }else if(board[x][y] == 'E' && count != 0){
            board[x][y] = (char)(count + '0');
        }
        return board;
    }
    public void dfs(char[][] board,int i,int j){
        board[i][j] = 'B';
        vis[i][j] = true;
        for(int k = 0;k < 8;k++){
            int x = i + dx[k];
            int y = j + dy[k];
            int dilei = fiddilei(board,x,y);
            if(x >= 0 && x < n && y >= 0 && y < m && board[x][y] == 'E' && dilei != 0 && !vis[x][y]){
                board[x][y] = (char)(dilei + '0');
                vis[x][y] = true;
                continue;
            }
            if(x >= 0 && x < n && y >= 0 && y < m && dilei == 0 &&
                    board[x][y] == 'E' && !vis[x][y]){
                dfs(board,x,y);
            }
        }
    }
    public int fiddilei(char[][] board,int i,int j){
        int ans = 0;
        for(int k = 0;k < 8;k++){
            int x = i + dx[k];
            int y = j + dy[k];
            if((x >= 0 && x < n && y >= 0 && y < m )&& (board[x][y] == 'M'
                    || board[x][y] == 'X')){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Main test1 = new Main();
    }
}