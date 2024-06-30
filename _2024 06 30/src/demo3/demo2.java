package demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-30
 * Time: 15:35
 */
import java.io.File;
import java.io.IOException;
public class demo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt"); //刚开始文件不存在
        //判断文件 | 目录是否存在
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println("---------------------------");
        //创建文件
        System.out.println(file.createNewFile());
        System.out.println("---------------------------");
        //判断文件 | 目录是否存在
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println("---------------------------");
        //判断在文件已经存在的情况下，是否能够创建成功。
        System.out.println(file.createNewFile());
        System.out.println("---------------------------");
        //进行文件删除
        System.out.println(file.delete());
        System.out.println("---------------------------");
        //判断文件 | 目录是否存在
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println("---------------------------");
    }
}
