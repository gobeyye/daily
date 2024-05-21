package question4;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-21
 * Time: 13:13
 */
//在下面，不要全部 copy











import java.util.*;
//解法：大模拟,其实应该跑路了
public class Main {

    public static int[] searchIndex1(String ss){
        //在运算符没有被擦掉的情况
        int[] ans = new int[2];
        char[] s = ss.toCharArray();
        int n = s.length;
        for(int i = 0;i < n;i++){
            if(s[i] == '+' || s[i] == '-' || s[i] == '*' || s[i] == '/'){
                ans[0] = i;
            }
            if(s[i] == '='){
                ans[1] = i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = s.length();
        char op = 'a';//表示运算符
        //1提取运算符
        if(s.charAt(0) == '?'){
            op = s.charAt(1);
        }else{
            for(int i = 0;i < s.length();i++){
                if(s.charAt(i) < '0' || s.charAt(i) > '9'){
                    op = s.charAt(i);//运算符
                    break;
                }
            }
        }
        //2.按照运算符计算
        int[] tmp = searchIndex1(s);
        int a = 0,b = 0,c = 0;
        switch(op){
            case '+':{
                //查找 运算符 和 = 号的位置
                if(s.charAt(0) == '?'){
                    //第一个字符是？
                    c = Integer.parseInt(s.substring(tmp[1] + 1,n));
                    b = Integer.parseInt(s.substring(tmp[0] + 1,tmp[1]));
                    System.out.println(c - b);
                    return;

                }else if(s.charAt(n - 1) == '?'){
                    a = Integer.parseInt(s.substring(0,tmp[0]));
                    b = Integer.parseInt(s.substring(tmp[0] + 1,tmp[1]));
                    System.out.println(a + b);
                    return;
                    //最后一个字符是？
                }else{
                    c = Integer.parseInt(s.substring(tmp[1] + 1,n));
                    a = Integer.parseInt(s.substring(0,tmp[0]));
                    System.out.println(c - a);
                    return;
//                    中间字符是？
                }

            }
            case '-':{
                if(s.charAt(0) == '?'){
                    //第一个字符是？
                    c = Integer.parseInt(s.substring(tmp[1] + 1,n));
                    b = Integer.parseInt(s.substring(tmp[0] + 1,tmp[1]));
                    System.out.println(c + b);
                    return;

                }else if(s.charAt(n - 1) == '?'){
                    a = Integer.parseInt(s.substring(0,tmp[0]));
                    b = Integer.parseInt(s.substring(tmp[0] + 1,tmp[1]));
                    System.out.println(a - b);
                    return;
                    //最后一个字符是？
                }else{
                    c = Integer.parseInt(s.substring(tmp[1] + 1,n));
                    a = Integer.parseInt(s.substring(0,tmp[0]));
                    System.out.println(a - c);
                    return;
//                    中间字符是？
                }
            }
            case '*':{
                if(s.charAt(0) == '?'){
                    //第一个字符是？
                    c = Integer.parseInt(s.substring(tmp[1] + 1,n));
                    b = Integer.parseInt(s.substring(tmp[0] + 1,tmp[1]));
                    System.out.println(c / b);
                    return;

                }else if(s.charAt(n - 1) == '?'){
                    a = Integer.parseInt(s.substring(0,tmp[0]));
                    b = Integer.parseInt(s.substring(tmp[0] + 1,tmp[1]));
                    System.out.println(a * b);
                    return;
                    //最后一个字符是？
                }else{
                    c = Integer.parseInt(s.substring(tmp[1] + 1,n));
                    a = Integer.parseInt(s.substring(0,tmp[0]));
                    System.out.println(c / a);
                    return;
//                    中间字符是？
                }

            }
            case '/':{
                if(s.charAt(0) == '?'){
                    //第一个字符是？
                    c = Integer.parseInt(s.substring(tmp[1] + 1,n));
                    b = Integer.parseInt(s.substring(tmp[0] + 1,tmp[1]));
                    System.out.println(c * b);
                    return;

                }else if(s.charAt(n - 1) == '?'){
                    a = Integer.parseInt(s.substring(0,tmp[0]));
                    b = Integer.parseInt(s.substring(tmp[0] + 1,tmp[1]));
                    System.out.println(a / b);
                    return;
                    //最后一个字符是？
                }else{
                    c = Integer.parseInt(s.substring(tmp[1] + 1,n));
                    a = Integer.parseInt(s.substring(0,tmp[0]));
                    System.out.println(a / c);
                    return;
//                    中间字符是？
                }

            }
            case '?':{
                int[] tmp2 = searchIndex2(s);
                a = Integer.parseInt(s.substring(0,tmp2[0]));
                b = Integer.parseInt(s.substring(tmp2[0] + 1,tmp2[1]));
                c = Integer.parseInt(s.substring(tmp2[1] + 1,n));
                if(c == (a + b)){
                    System.out.println('+');
                }else if(c == (a - b)){
                    System.out.println('-');
                }else if(c == (a * b)){
                    System.out.println('*');
                }else{
                    System.out.println('/');
                }
            }
        }
    }
    public static int[] searchIndex2(String ss){
        //在运算符没有被擦掉的情况
        int[] ans = new int[2];
        char[] s = ss.toCharArray();
        int n = s.length;
        for(int i = 0;i < n;i++){
            if(s[i] == '?'){
                ans[0] = i;
            }
            if(s[i] == '='){
                ans[1] = i;
            }
        }
        return ans;
    }
}
