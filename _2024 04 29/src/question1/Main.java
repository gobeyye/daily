package question1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-29
 * Time: 20:45
 */
/*import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            char[] s1 = in.next().toCharArray();
            char[] s2 = in.next().toCharArray();
            int[] hash1 = new int[26];
            int[] hash2 = new int[26];
            for(int i = 0;i < s1.length;i++){
                hash1[s1[i] - 'A']++;
            }
            for(int i = 0;i < s2.length;i++){
                hash2[s2[i] - 'A']++;
            }
            for(int i = 0;i < 26;i++){
                if(hash2[i] > hash1[i]){
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }

    }
}*/




import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            char[] s1 = in.next().toCharArray();
            char[] s2 = in.next().toCharArray();
            int[] hash1 = new int[26];
            int[] hash2 = new int[26];
            for(int i = 0;i < s1.length;i++){
                hash1[s1[i] - 'A']++;
            }
            for(int i = 0;i < s2.length;i++){
                hash2[s2[i] - 'A']++;
            }
            boolean key = true;
            for(int i = 0;i < 26;i++){
                if(hash2[i] > hash1[i]){
                    System.out.println("No");
                    key = false;
                    break;
                }
            }
            if(key == true){
                System.out.println("Yes");
            }

        }

    }
}
