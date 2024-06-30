package demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-30
 * Time: 15:56
 */
import java.io.File;
import java.io.IOException;
public class demo4 {
    public static void main(String[] args) throws IOException {
        File dir = new File("parent/aaa/bbb/ccc");//这里的 parent 和 aaa bbb ccc 都不存在
        System.out.println(dir.isDirectory());
        System.out.println(dir.isFile());
        System.out.println("----------------------------");
        System.out.println(dir.mkdir());
        System.out.println("----------------------------");
        System.out.println(dir.mkdirs());
        System.out.println("----------------------------");
        System.out.println(dir.isDirectory());
        System.out.println(dir.isFile());
    }
}
