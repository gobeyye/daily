package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-17
 * Time: 22:34
 */
public class demo4 {
    public static void main(String[] args) {
        char[] ss = new char[20];
        StringBuilder sd = new StringBuilder();
        String s = new String();
        //没有修改的方法
        sd.append("1345");

        Integer ans = Integer.parseInt(sd.toString());
        //parseInt 是传入 String 类型的数据的
        System.out.println(ans);
    }
}
