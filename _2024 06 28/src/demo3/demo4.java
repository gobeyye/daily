package demo3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-28
 * Time: 15:50
 */
abstract class A{
    public A(String s){

    }
    public A(){

    }
}
class B extends A{
    int a = 0;
    public B(int a){
//        System.out.println();
        super();//这里会默认调用一个 super ，默认是调用没有参数的版本，如果父类构造方法是有参数的话，需要显示调用 super
        this.a = a;
    }
}

public class demo4 {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("./text.txt");
        outputStream.write(97);
        outputStream.write(98);
        outputStream.write(99);
        outputStream.write(100);
//        String s = new String();
//        B b = new B();
//        B b = new B();
    }
}
