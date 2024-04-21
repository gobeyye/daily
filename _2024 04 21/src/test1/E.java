package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-21
 * Time: 19:03
 */
public class E{
    public static void main(String args[]) {
        Student zhang = new Student();
        double area =
                zhang.area(new Rect(2,3),new Circle(5.2),new Circle(12));
        System.out.printf("2个圆和1个矩形图形的面积和：\n%10.3f",area);
    }
}

