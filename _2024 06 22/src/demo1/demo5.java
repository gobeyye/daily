package demo1;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-23
 * Time: 18:56
 */
import java.util.Scanner;
public class demo5 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        File f = new File("./test.txt");
        f.createNewFile();
        f.deleteOnExit();
        in.next();



    }
}
