package demo2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-27
 * Time: 13:18
 */
import java.io.*;
public class demo1 {
    public static void main(String[] args) throws IOException {
        int a = 3;
        try(InputStream stream = new FileInputStream("d:/text.txt")){
            byte[] bytes = new byte[1024];
            int n = stream.read(bytes);
            for(int i = 0;i < n;i++){
                System.out.printf("0x%x",bytes[i]);
            }
        }
    }
}
