package demo3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-29
 * Time: 12:47
 */
import java.io.File;
import java.util.*;
public class demo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要查找的指定目录");
        String seDir = in.next();
        File file = new File(seDir);
        if(!file.isDirectory()){
            System.out.println("输入的不是目录,程序结束");
            return;
        }
        System.out.println("请输入您要查找的指定字母:");
        String seFil = new String();
        seFil = in.next();
        searchFile(file,seFil);
    }
    public static void searchFile(File file,String seFil){
        File[] files = file.listFiles();
        //运用递归怎么可以不设置出口呢
        if(files == null) return;//这个其实挺没有必要的
        for(int i = 0;i < files.length;i++){
            if(files[i].isDirectory()){
                //如果还是目录，继续进行查找
                searchFile(files[i],seFil);
            }else if(files[i].isFile()){
                if(files[i].getName().contains(seFil)){
                    System.out.println(files[i].getAbsolutePath());
                }
            }
        }
    }
}



//
//import java.io.File;
//import java.util.Scanner;
//
//public class demo2 {
//    public static void main(String[] args) {
//        // 1. 输入必要的信息
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入要搜索的目录: ");
//        String rootPath = scanner.next();
//        System.out.println("请输入要查询的词: ");
//        String searchWord = scanner.next();
//
//        // 2. 构造 File 对象, 检查路径是否合法.
//        File rootFile = new File(rootPath);
//        if (!rootFile.isDirectory()) {
//            System.out.println("输入的路径非法!");
//            return;
//        }
//
//        // 3. 进行递归搜索.
//        searchFile(rootFile, searchWord);
//    }
//
//    private static void searchFile(File rootFile, String searchWord) {
//        // 1. 列出当前目录中有哪些内容
//        File[] files = rootFile.listFiles();
//        if (files == null) {
//            // 空目录, 直接 返回
//            return;
//        }
//        // 2. 遍历目录下的每个结果, 进行判定
//        for (File f : files) {
//            // System.out.println("当前扫描文件为: " + f.getAbsolutePath());
//            if (f.isFile()) {
//                // 普通文件, 就判定文件名是否包含 查询词.
//                String fileName = f.getName();
//                if (fileName.contains(searchWord)) {
//                    // 当前文件即为所求
//                    System.out.println("找到匹配结果: " + f.getAbsolutePath());
//                }
//            } else if (f.isDirectory()) {
//                // 针对子目录进一步递归
//                searchFile(f, searchWord);
//            }
//        }
//    }
//}


