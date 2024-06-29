package boke1;

import java.io.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-29
 * Time: 16:56
 */

//案例二
//目的：进行文件的复制
//具体：输入两个文件地址，把第一个文件内容复制到第二个文件里面去（不存在的话，创建一个）

public class demo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要复制的文件:");
        String srcFileRoot = in.next();//都是这么写的
        File srcFile = new File(srcFileRoot);
        //要适当的留一些空格，看起来比较舒服

        //判断输入是否合法
        if (!srcFile.isFile()) {
            System.out.println("输入的地址内容不是个文件");
            return;
        }
        System.out.println("请输入要粘贴的文件地址:");//这样要写到具体，即使不存在的话
        String destFileRoot = in.next();
        File destFile = new File(destFileRoot);
        if (!destFile.getParentFile().isDirectory()) {
            System.out.println("输入的粘贴地址有误");
            return;
        }

        copyFile(srcFile, destFileRoot);
        System.out.println("复制成功");
    }

    private static void copyFile(File srcFile, String destFileRoot) {
        try (InputStream inputStream = new FileInputStream(srcFile);
             OutputStream outputStream = new FileOutputStream(destFileRoot)) {

            while (true) {
                //读取数据
                byte[] bytes = new byte[1024];
                int n = inputStream.read(bytes);
                if (n == -1) break;
                //写入文件
                //不要把空数据写入。
                outputStream.write(bytes, 0, n);
            }
            outputStream.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
