package test3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-05
 * Time: 23:31
 */
import java.io.IOException;
public class E{
    public static void main(String[] args) {
        try{ methodA();
        }
        catch (IOException e){
            System.out.println("你好");
            return;
        }
        finally {
            System.out.println(" fine thanks");
        }
    }
    public static void methodA() throws IOException{
        throw new IOException();
    }
}

