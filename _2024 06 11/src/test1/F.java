package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-06-11
 * Time: 23:20
 */
import java.sql.*;
import java.util.*;
public class F {
    public static void main(String args[]) {
        int wantRecordAmount = 10;  //随机抽取的记录数目
        Random random =new Random();
        try{  Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }
        catch(Exception e) {
            System.out.print(e);
        }
        Connection con;
        Statement sql;
        ResultSet rs;
        try {
            con=DriverManager.getConnection("jdbc:derby:employee;create=false");
            sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            rs =sql.executeQuery("select * from salary ");
            rs.last();      //将rs的游标移到rs的最后一行
            int count=rs.getRow();
            Vector<Integer> vector=new Vector<Integer>();
            for(int i=1;i<=count;i++) {
                vector.add(new Integer(i));
            }
            int itemAmount=Math.min(wantRecordAmount,count);//随机抽取的记录数
            double sum =0;
            int n = itemAmount;
            while(itemAmount>0) {
                int randomIndex = random.nextInt(vector.size());
                int index=(vector.elementAt(randomIndex)).intValue();
                rs.absolute(index); //将rs的游标游标移到index
                double price=rs.getDouble(2);
                sum = sum+price;
                itemAmount--;
                vector.removeElementAt(randomIndex);
            }
            con.close();
            double aver = sum/n;
            System.out.println("随机抽取"+n+"条记录的");
            System.out.println("其平均工资："+aver);
        }
        catch(SQLException e) {
            System.out.println(""+e);
        }
    }
}
