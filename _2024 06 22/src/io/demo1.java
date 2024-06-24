package io;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-23
 * Time: 18:32
 */
import java.io.File;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
//        File f = new File("d:/test.txt");\
          File f = new File("./test.txt");
          f.delete();
        System.out.println(f.getParent());

        System.out.println(f.getName());
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getCanonicalPath());
//        f.createNewFile();
        System.out.println(f.exists());
    }
}
