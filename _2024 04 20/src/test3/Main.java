package test3;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-20
 * Time: 13:39
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a == 0 || a == 1){
            if(a == 0){
                if(b == 1){
                    System.out.println("-");
                    System.out.println("stop");
                }else{
                    //b == 0
                    System.out.println("biii");
                    System.out.println("stop");
                }

            }else{
                if(b == 1){
                    System.out.println("-");
                    System.out.println("move");

                }else{
                    //b == 0
                    System.out.println("dudu");
                    System.out.println("move");
                }
                //a == 1
            }

        }else{
            System.out.println("-");
            System.out.println("stop");


        }
    }
}
