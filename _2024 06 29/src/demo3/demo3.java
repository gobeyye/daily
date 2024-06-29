package demo3;

import java.io.IOException;
import java.io.Reader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-29
 * Time: 14:52
 */
import java.util.*;
import java.io.*;
public class demo3 {
    public static void main(String[] args) {
       File file = new File("./text.txt");
//       System.out.println(file.exists());
        File[] files = file.listFiles();
        if(files == null){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
