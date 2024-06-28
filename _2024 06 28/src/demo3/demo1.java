package demo3;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-28
 * Time: 14:46
 */
public class demo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:/text.txt");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
//        file.mkdir();
        file.delete();
//        file.mkdir();
        file.delete();
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

    }
}
