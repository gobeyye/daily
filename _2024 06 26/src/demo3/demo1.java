package demo3;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-26
 * Time: 15:42
 */

public class demo1 {
    public static void main(String[] args) throws IOException {
        InputStream stream = new FileInputStream("./text.txt");
        while(true){
            byte[] bytes = new byte[1024];
            int n = stream.read(bytes);
            if(n == -1) break;
            for(int i = 0;i < n;i++){
                System.out.printf("0x%x ",bytes[i]);
            }
        }
    }
}
