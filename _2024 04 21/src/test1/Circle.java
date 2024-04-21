package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-21
 * Time: 19:02
 */
public class Circle extends Geometry {
    double r;
    Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return 3.14 * r * r;
    }
    //    【代码2】 //重写 getArea()方法,返回圆面积
}
