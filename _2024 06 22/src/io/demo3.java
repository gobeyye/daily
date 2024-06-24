package io;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-23
 * Time: 19:28
 */
import java.io.File;
import java.io.IOException;
public class demo3 {
    public static void main(String[] args) throws IOException {
        File file = new File("./some-parent/some-file.txt"); // 要求 some-file.txt 得存在
        File dest = new File("./some-parent/some-dir/some-file.txt"); // 要求 dest.txt 不存在
        // c 的参数太杂了
        System.out.println(file.renameTo(dest));
    }
}

