package demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-29
 * Time: 11:20
 */
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        try (OutputStream os = new FileOutputStream("output.txt")) {
            String s = "你好中国";
            byte[] b = s.getBytes("utf-8");
            os.write(b);
            // 不要忘记 flush
            os.flush();
        }
    }
}

