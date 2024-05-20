package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-20
 * Time: 12:57
 */
public class Main {
    public static void main(String[] args) {
        int j = 0;
        for(int i = 2024;i <= 2023 * 2023;i++){
            if(check(i,2023)){
                j++;
                System.out.print(" " + i + " ");
                if(j % 10 == 0){
                    System.out.println();
                }
            }

        }
    }
    public static boolean check(int a,int b){
        int min = Math.min(a,b);
        for(int i = 2;i <= min;i++){
            if(a % i == 0 && b % i == 0){
                return false;
            }
        }
        return true;

    }
}
