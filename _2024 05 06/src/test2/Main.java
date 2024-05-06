package test2;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-06
 * Time: 16:49
 */
///////////////////////////////////////?
public class Main {
    public static int calculate(String ss) {
        //1.转换成后缀表达式
        char[] s = ss.toCharArray();
        Stack<Character> stack = new Stack<>();
        StringBuilder ret = new StringBuilder();//后缀表达式
        int n = s.length;
        for(int i = 0;i < n;){
            if(s[i] == ' '){
                //空格情况
                i++;
                continue;

            }else if(s[i] >= '0' && s[i] <= '9'){
                //数字情况
                while(i < n && s[i] >= '0' && s[i] <= '9'){
                    ret.append(s[i++]);
                }
                ret.append('#');
            }else{
                //算符情况
                if(stack.isEmpty()){
                    stack.push(s[i]);
                }else if((s[i] == '*' || s[i] == '/') && (stack.peek() == '+' || stack.peek() == '-')){
                    stack.push(s[i]);
                }else{
                    if(s[i] == '+' || s[i] == '-'){
                        while(!stack.isEmpty()){
                            ret.append(stack.pop());
                        }
                        stack.push(s[i]);//全都推出去后，要把新的再进来,这里忘记了
                    }else{
                        while(!stack.isEmpty() && stack.peek() != '+' && stack.peek() != '-'){
                            ret.append(stack.pop());
                        }
                        stack.push(s[i]);//全都推出去后，要把新的再进来,这里忘记了
                    }

                }
                i++;
            }

        }
        while(!stack.isEmpty()){
            ret.append(stack.pop());
        }
       System.out.println(ret);
        //2.根据后缀表达式求值
        //2.根据后缀表达式求值
        Stack<Integer> st = new Stack<>();
        String tmp = ret.toString();
        int len = tmp.length();
        for(int i = 0;i < len;i++){
            if(tmp.charAt(i) >= '0' && tmp.charAt(i) <= '9'){
                //数字的情况
                int d = 0;
                while(i < len && tmp.charAt(i) != '#'){//防止纯数字的情况
                    d = d * 10 + (int)(tmp.charAt(i) - '0');
                    i++;
                }
//                i++;//
                st.push(d);
            }else{
                //算符的情况
                int a = st.pop();
                int b = st.pop();
                char ch = tmp.charAt(i);
                switch(ch){
                    case '+':st.push(b + a);break;
                    case '-':st.push(b - a);break;
                    case '*':st.push(b * a);   break;
                    case '/':st.push(b / a);break;
                }
            }
        }
        return st.pop();

    }

    public static void main(String[] args) {
        String tmp ="1+2*5/3+6/4*2";
        System.out.println(calculate(tmp));
    }
}
