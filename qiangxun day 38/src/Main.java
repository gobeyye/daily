/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */

import java.util.*;
import java.io.*;
//为什么不行
public class Main {
    public static PrintWriter out = new PrintWriter(new BufferedWriter(new
            OutputStreamWriter(System.out)));
    public static Read in = new Read();

    public static int n;
    public static int[][] arr;

    public static void setRow() {
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                // arr[i][j] 与 arr[n - 1 - i][j]
                int tmp = arr[i][j];
                arr[i][j] = arr[n - 1 - i][j];
                arr[n - 1 - i][j] = tmp;
            }
        }
    }

    public static void setCol() {
        for (int j = 0; j < n / 2; j++) {

            for (int i = 0; i < n; i++) {
                // arr[i][j] 与 arr[i][n - 1 - j]
                int tmp = arr[i][j];
                arr[i][j] = arr[i][n - 1 - j];
                arr[i][n - 1 - j] = tmp;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        n = in.nextInt();
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int q = in.nextInt();
        int row = 0, col = 0;
        while (q-- != 0) {
            int x = in.nextInt();
            if (x == 1) {
                row++;
                col++;
            } else {
                row++;
            }
        }

        // 优化
        row %= 2;
        col %= 2;
        if (row != 0) setRow();
        if (col != 0) setCol();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                out.print(arr[i][j] + " ");
            }
            out.println("");
        }

        out.close();
    }
}

class Read // ⾃定义快速读⼊
{
    StringTokenizer st = new StringTokenizer("");
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String next() throws IOException {
        while (!st.hasMoreTokens()) {
            st = new StringTokenizer(bf.readLine());
        }
        return st.nextToken();
    }

    String nextLine() throws IOException {
        return bf.readLine();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }
}

