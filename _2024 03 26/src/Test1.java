/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-03-26
 * Time: 10:37
 */
public class Test1 {
    public static void main(String[] args) {
        Test1 test = new Test1();
        char[][] board = {{'A','B','C','D'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(test.exist(board, word));
    }
    char[][] board;
    int n;//行
    int m;//列
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    public boolean exist(char[][] _board, String _word) {
        n = _board.length;
        m = _board[0].length;
        board = _board;
        char[] word = _word.toCharArray();
        return dfs(word,0,0,0);
    }
    public boolean dfs(char[] word,int xi,int yi,int step){
        if(step == word.length){
            return true;
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(board[xi][yi] == word[step]){
                    System.out.print(board[i][j] + " ");
                    for(int k = 0;k < 4;k++){
                        int x = i + dx[k];
                        int y = j + dy[k];
                        if(x >= 0 && x < n && y >= 0 && y < m){
                            if(dfs(word,x,y,step + 1) == true){
                                return true;
                            }
                        }

                    }
                }
            }
            return false;
        }
        return false;
    }
}
