package demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-30
 * Time: 16:06
 */
import java.io.File;
import java.io.IOException;
public class demo5 {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt"); // 要求 some-file.txt 得存在
        File dest = new File("dest.txt"); // 要求 dest.txt 不存在
        System.out.println(file.exists());
        System.out.println(dest.exists());
        System.out.println("-------------------------");
        System.out.println(file.renameTo(dest));
        System.out.println("-------------------------");
        System.out.println(file.exists());
        System.out.println(dest.exists());
    }
}
