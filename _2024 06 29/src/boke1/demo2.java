package boke1;

import java.io.*;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-29
 * Time: 17:24
 */
//案例三
//目的：扫描指定⽬录，并找到内容中包含指定字符的所有普通⽂件（不包含⽬录）
public class demo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要搜索的目录:");
        String dirRoot = in.next();
        File dirFile = new File(dirRoot);
        if(!dirFile.isDirectory()){
            System.out.println("目录输入错误");
            return;
        }
        System.out.println("请输入要查找的指定内容");
        String serWord = in.next();
        searchFile(dirFile,serWord);
    }

    private static void searchFile(File dirFile,String serWord) {
        File[] files = dirFile.listFiles();
        //这里不用判断为空
        for(int i = 0;i < files.length;i++){
            if(files[i].isFile()){
                //查找指定内容
                searchWord(files[i],serWord);
            }else if(files[i].isDirectory()){
                //递归进行查找
                searchFile(files[i],serWord);
            }
        }
    }
    private static void searchWord(File file, String serWord) {
        //查找文件内容
        StringBuilder sd = new StringBuilder();
        try(InputStream inputStream = new FileInputStream(file)){
            //读取数据
            while(true){
                int n = inputStream.read();
                if(n == -1) break;
                sd.append((char)n);
            }
            if(sd.indexOf(serWord) >= 0){
                //找到了
                System.out.println("文件路径为：" + file.getAbsolutePath());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
