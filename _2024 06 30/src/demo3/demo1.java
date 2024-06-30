package demo3;

import java.io.File;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-30
 * Time: 10:52
 */
public class demo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in,"UTF-8");
        File file = new File("");
//        file.pathSeparator;
        String s = File.pathSeparator;
        //普通的静态方法需要类名来访问，编译器不会进行提示
    }
}
