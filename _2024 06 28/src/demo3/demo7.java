package demo3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-28
 * Time: 16:33
 */
public class demo7 {
    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
        File file = new File("./text2.txt");
//        file.createNewFile();
        file.mkdir();
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
    }

}
