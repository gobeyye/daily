package demo1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-10
 * Time: 9:27
 */


import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

//工厂模式，把构造方法封装起来
class makePointByXY {
    public static Point createPointByXY(int X, int Y) {
        Point p = new Point();
        p.X = X;
        p.Y = Y;
        return p;
    }
}

class Point {
    int X, Y;//这里两个的参数的含义本来就不一样，就是要设置成不一样的啊
    int R, A;

    //    public static Point makePointByXy(int x,int y){//这里必须是要静态的，因为是通过类名来创建对象的
//        Point point = new Point();
//        point.setX(x);//这里不需要静态的，因为这里是通过对象实例来调用的
//        point.setY(y);
//        return point;
//    }
    public static Point makePointByRA(int R, int A) {
        Point point = new Point();
        point.setR(R);
        point.setA(A);
        return point;
    }

    public void setX(int X) {
        this.X = X;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public void setR(int R) {
        this.R = R;
    }

    public void setA(int A) {
        this.A = A;
    }

}

public class demo1 {
    public static void main(String[] args) {
        Point p1 = makePointByXY.createPointByXY(3, 4);
    }//熟能生巧
}
