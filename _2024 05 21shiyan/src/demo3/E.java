package demo3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-21
 * Time: 15:19
 */
public class E {
    public static void main(String[] args) {
        String cost = "数学 87 分，物理 76 分，英语 96 分";
        Scanner scanner = new Scanner(cost);
        scanner.useDelimiter("[^0123456789.]+");
        double sum = 0;
        int count = 0;
        while(scanner.hasNext()){
            try{
                double score = scanner.nextDouble();
                count++;
                sum = sum + score;
                System.out.println(score);
            }catch(InputMismatchException exp){
                String t = scanner.next();
            }
        }
        System.out.println("总分:" + sum + "分");
        System.out.println("平均分:" + sum / count + "分");
    }
}
