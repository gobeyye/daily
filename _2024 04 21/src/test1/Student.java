package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-21
 * Time: 19:03
 */
public class Student {
    public double area(Geometry ...p) {
        double sum=0;
        for(int i=0;i<p.length;i++) {
            sum=sum+p[i].getArea();
        }
        return sum;
    }
}
