package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-06
 * Time: 10:00
 */
public class test3 {
    public static String multiply(String num1, String num2) {
        //1.转换成整数数组并反转
        int n = num1.length();
        int m = num2.length();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int[] ansArr = new int[n + m];
        int k = 0;
        for(int i = n - 1;i >= 0;i--){
            arr1[k++] = num1.charAt(i) - '0';
        }
        k = 0;
        for(int i = m - 1;i >= 0;i--){
            arr2[k++] = num2.charAt(i) - '0';
        }
        //2.对应相乘相加
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                ansArr[i + j] += (arr1[i] * arr2[j]);//不能是==
            }
        }
        //3.进位
        int d = 0;//进位
        for(int i = 0;i < m + n || d != 0;i++){
            int tmp = ansArr[i] + d;
            ansArr[i] = tmp % 10;
            d = tmp / 10;
        }
        //去除前导零
        int right = m + n - 1;
        while(right >= 1 && ansArr[right] == 0){
            right--;
        }
        //4.sd.append
        StringBuilder sd = new StringBuilder();
        while(right >= 0){
            sd.append(ansArr[right--]);
        }
        //5.转换成字符串
        String ans = sd.toString();
        return ans;
    }
    public static void main(String[] args) {
        String s1 = "12";
        String s2 = "45";
        String ans = multiply(s1,s2);
        System.out.println(ans);
    }
}
