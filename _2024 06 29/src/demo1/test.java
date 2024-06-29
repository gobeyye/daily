package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-29
 * Time: 17:23
 */


//import java.io.*;
//import java.util.Scanner;
//
//public class test {
//    public static void main(String[] args) {
//        // 1. 输入必要的信息
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入要复制的文件路径: ");
//        String srcPath = scanner.next();
//        System.out.println("请输入要复制到的目标路径: ");
//        String destPath = scanner.next();
//
//        // 2. 验证上述路径是否合法.
//        File srcFile = new File(srcPath);
//        if (!srcFile.isFile()) {
//            System.out.println("输入的要复制的文件路径非法!");
//            return;
//        }
//        File destFile = new File(destPath);
//        if (!destFile.getParentFile().isDirectory()) {
//            System.out.println("输入的要复制到的目标路径非法!");
//            return;
//        }
//
//        // 3. 读写文件
//        try (InputStream inputStream = new FileInputStream(srcFile);
//             OutputStream outputStream = new FileOutputStream(destFile)) {
//            while (true) {
//                byte[] bytes = new byte[1024];
//                int n = inputStream.read(bytes);
//                if (n == -1) {
//                    break;
//                }
//                outputStream.write(bytes, 0, n);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}