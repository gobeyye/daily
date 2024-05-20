package demo6;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-05-20
 * Time: 17:24
 */
class MyString{
    public String getString(String s){
        StringBuffer str = new StringBuffer();
        for(int i = 0;i < s.length();i++){
            if(i % 2 == 0){
                char c = s.charAt(i);
                str.append(c);
            }
        }
        return new String(str);
    }
}
public class E {
    public static void main(String[] args) {
        String s = "1234567890";
        MyString ms = new MyString();
        System.out.println(ms.getString(s));
    }
}
