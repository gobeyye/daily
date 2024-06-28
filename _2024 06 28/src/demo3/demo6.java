package demo3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-28
 * Time: 16:20
 */
public class demo6 {
    public static void main(String[] args) throws IOException {
        try(Reader reader = new FileReader("./text.txt")){
            while(true){
                char[] chars = new char[1024];
//            int n = reader.read();
                int n = 0;
                n = reader.read(chars);
                if(n == -1) break;
                for(int i = 0;i < n;i++){
                    System.out.print(chars[i] + " ");
                }
            }
        }
    }
}
