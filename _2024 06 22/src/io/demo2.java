package io;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-23
 * Time: 19:23
 */
import java.io.File;
import java.io.IOException;
public class demo2 {
    public static void main(String[] args) throws IOException {
        File dir = new File("some-parent\\some-dir"); // some-parent 和 so
        System.out.println(dir.isDirectory());
        System.out.println(dir.isFile());
        System.out.println(dir.mkdirs());
        System.out.println(dir.isDirectory());
        System.out.println(dir.isFile());
    }
}

