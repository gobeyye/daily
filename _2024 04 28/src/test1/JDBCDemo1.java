package test1;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-28
 * Time: 21:17
 */

/**
 * 插入2.0
 */
public class JDBCDemo1 {
    public static void main(String[] args) throws SQLException {
        Scanner in = new Scanner(System.in);
        System.out.println("输入id");
        int id = in.nextInt();
        System.out.println("输入姓名");
        String name = in.next();
        //1.创建 “数据源”
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/daily?characterEncodint=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("123456");
        //2.和数据库服务器创建连接
        Connection connection = dataSource.getConnection();
        //3.构造一个操作数据库的sql语句
        String sql = "insert into test1 values(?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,name);

        //4.执行sql
        int n = preparedStatement.executeUpdate();
        System.out.println(n);

        //5.收尾工作
        preparedStatement.close();
        connection.close();

    }
}
