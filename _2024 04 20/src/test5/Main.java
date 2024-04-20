package test5;



/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-20
 * Time: 14:13
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<String> set = new HashSet<>();
        for(int i = 0;i < n;i++){
            String s = in.next();
            set.add(s);
        }
        int k = in.nextInt();
        boolean key = true;
        int count = 0;
        String ss = in.nextLine();
        String[] sss = in.nextLine().split(" ");
        for(int i = 0;i < sss.length;i++){
            if(set.contains(sss[i])){
                sss[i] = "<censored>";
                k--;
                count++;
            }
            if(k < 1){
                key = false;
            }
        }
        if(key == false){
            System.out.println(count);
            System.out.println("He Xie Ni Quan Jia!");
        }else{
            StringBuilder st = new StringBuilder();
            for(int i = 0;i < sss.length;i++){
                st.append(sss[i]);
                if(i == sss.length - 1){
                    break;
                }
                st.append(" ");
            }
            System.out.println(st.toString());
        }

    }
}
