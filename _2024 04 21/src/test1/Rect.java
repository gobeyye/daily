package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-21
 * Time: 19:00
 */
public class Rect extends Geometry {
    double a,b;

    @Override
    public double getArea() {
        return a * b;
    }

    Rect(double a, double b) {
        this.a = a;
        this.b = b;
    }
//   【代码1】 //重写 getArea()方法,返回矩形面积

}

