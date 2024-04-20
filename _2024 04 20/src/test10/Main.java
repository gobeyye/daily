package test10;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-20
 * Time: 15:58
 */






import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] sss = new String[n];
        in.nextLine();
        for(int i = 0;i < n;i++){////////////////空额
            sss[i] = in.nextLine();
        }
        Arrays.sort(sss);
        String[] headS = new String[n];
        for(int i = 0;i < n;i++){
            StringBuilder sd = new StringBuilder();
            String tmp = sss[i];
            String[] tmpsss = tmp.split(" ");
            for(int k = 0;k < tmpsss.length;k++){
                if(tmpsss[k].length() == 0){
                    continue;
                }
                sd.append(tmpsss[k].charAt(0));
            }
            headS[i] = sd.toString();
        }
        int m = in.nextInt();
        in.nextLine();
        int j = 0;
        while(j < m){
            StringBuilder sd = new StringBuilder();
            String tmp = in.nextLine();
            String[] tmpsss = tmp.split(" ");
            for(int k = 0;k < tmpsss.length;k++){
                if(tmpsss[k].length() == 0){
                    continue;
                }
                sd.append(tmpsss[k].charAt(0));
            }
            String duida = null;
            duida = sd.toString();
            int count = 0;
            for(int i = 0;i < n;i++){
                if(tmp.equals(headS[i])){
                    count++;
                }
            }
            if(count == 0){
                System.out.println(tmp);
            }else if(count == 1){
                for(int i = 0;i < n;i++){
                    if(tmp.equals(headS[i])){
                        System.out.println(sss[i]);
                    }
                }
            }else{
                for(int i = 0;i < n;i++){
                    if(tmp.equals(headS[i])){
                        System.out.println(sss[i]);
                        if(count > 1){
                            System.out.println("|");
                        }
                        count--;
                    }
                }

            }
            j++;
        }
    }
}
