package demo3;

import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-29
 * Time: 10:43
 */
import java.io.*;
public class demo1 {
    public static void main(String[] args) throws IOException {
//        try(InputStream inputStream = new FileInputStream("./text.txt")) {
//            try(Scanner in = new Scanner(inputStream,"UTF-8")){
//                System.out.println(in.next());
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        File file = new File("./text.txt");
        file.createNewFile();
        InputStream inputStream = new FileInputStream("./text.txt");//inputStream 要求文件必须是存在的

    }
}
