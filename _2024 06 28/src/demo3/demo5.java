package demo3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-28
 * Time: 16:14
 */
public class demo5 {
    public static void main(String[] args) throws IOException {
//        String s = new String();
        OutputStream outputStream = new FileOutputStream("./text.txt",true);
        outputStream.write(97);
        outputStream.write(98);
        outputStream.write(99);
        outputStream.write(100);
        outputStream.close();
    }
}
