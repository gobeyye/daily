package test1;

import java.util.Collections;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-07
 * Time: 10:08
 */
public class Main {
    public String decodeString(String ss) {
        Stack<Character> st2 = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        char[] s = ss.toCharArray();
        int n = s.length;
        StringBuilder sd = new StringBuilder();
        // 1.双栈处理
        for (int i = 0; i < n;) {
            // 提取数字
            if (s[i] >= '0' && s[i] <= '9') {
                int d = 0;
                while (i < n && s[i] >= '0' && s[i] <= '9') {
                    d = d * 10 + (int) (s[i] - '0');
                    i++;
                }
                // 放入st1
                st1.push(d);

                while (!st1.isEmpty()) {
                    StringBuilder tmp = new StringBuilder();
                    while (s[i] != ']') {
                        if (s[i] >= '0' && s[i] <= '9') {
                            d = 0;
                            while (i < n && s[i] >= '0' && s[i] <= '9') {
                                d = d * 10 + (int) (s[i] - '0');
                                i++;
                            }
                            // 放入st1
                            st1.push(d);
                        } else {
                            st2.push(s[i]);
                            i++;
                        }

                    }
                    while (st2.peek() != '[') {
                        tmp.append(st2.pop());
                    }
                    int k = st1.pop();
                    st2.pop();
                    for (int j = 0; j < k; j++) {
                        int len = tmp.length();
                        for (int h = len - 1; h >= 0; h--) {
                            st2.push(tmp.charAt(h));
                        }
                    }
                    i++;
                }
                Collections.reverse(st2);
                while(!st2.isEmpty()){
                    sd.append(st2.pop());
                }
            }else{
                sd.append(s[i]);
                i++;
                //最后一定要记得i++
            }

        }
        return sd.toString();
        // 2.最后考虑要不要反转

    }
}
