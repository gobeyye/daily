package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-11
 * Time: 23:18
 */
import java.util.*;
import java.sql.*;
public class E {
    public static void main(String args[]) {
        try{  Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }
        catch(ClassNotFoundException e) {
            System.out.print(e);
        }
        Connection con=null;
        Statement sta = null;
        PreparedStatement sql=null;   //预处理语句
        try {
            con =DriverManager.getConnection("jdbc:derby:employee;create=true");//连接到数据库employee
            sta = con.createStatement();
            String s="create table salary(number int primary key not null,money double)";
            sta.execute(s);//创建表salary,如果表已存在，不再重新创建，并发生SQLException
            sql=con.prepareStatement("INSERT INTO salary VALUES (?,?)");
        }
        catch(SQLException exp){
        }
        finally{
            try {
                sql=con.prepareStatement("INSERT INTO salary VALUES (?,?)");
            }
            catch(SQLException ee){}
        }
        int number=0;
        double money =0;
        Scanner scanner = new Scanner(System.in);
        int condition=1;
        while(condition==1) {
            System.out.print("输入工资号（整数）：");
            number = scanner.nextInt();
            System.out.print("输入工资（浮点数）：");
            money = scanner.nextDouble();
            try {
                sql.setInt(1,number);
                sql.setDouble(2,money);
                sql.execute();
            }
            catch(Exception ex){
                System.out.print("添加记录失败！"+ex);
            }
            System.out.print("输入1继续，非1结束");
            condition = scanner.nextInt();
        }
    }
}


