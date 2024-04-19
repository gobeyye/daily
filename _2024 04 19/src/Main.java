/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ${USER}
 * Date: ${YEAR}-${MONTH}-${DAY}
 * Time: ${TIME}
 */
public class Main {
    public static int minNumberOfFrogs(String croakOfFrogs) {
        int[] hash = new int[26];
        for(int i = 0;i < croakOfFrogs.length();i++){
            hash[(int)(croakOfFrogs.charAt(i) - 'a')]++;
        }
        int x1 = hash[(int)('c' - 'a')];
        int x2 = hash[(int)('r' - 'a')];
        int x3 = hash[(int)('o' - 'a')];
        int x4 = hash[(int)('a' - 'a')];
        int x5 = hash[(int)('k' - 'a')];
        if(x1 != x2 || x2 != x3 || x3 != x4 || x4 != x5){
            return -1;
        }
        int max = 0;
        for(int i = 0;i < croakOfFrogs.length();i += 5){
            hash = new int[26];
            for(int j = i;j < i + 5 && j < croakOfFrogs.length();j++){
                hash[(int)(croakOfFrogs.charAt(j) - 'a')]++;
            }
            for(int k = 0;k < 26;k++){
                max = Math.max(max,hash[k]);
            }
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(minNumberOfFrogs("aoocrrackk"));
    }
}