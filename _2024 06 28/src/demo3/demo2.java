package demo3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-28
 * Time: 15:12
 */
public class demo2 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("./text.txt");
        byte[] bytes = new byte[1024];
        while(true){
            int n = inputStream.read(bytes);
            if(n == -1) break;
//            System.out.printf("0x%x\n",n);
            for(int i = 0;i < n;i++){
                System.out.printf("0x%x ",bytes[i]);
            }
        }
        inputStream.close();
    }

}
