package JDBCDemo1;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-30
 * Time: 15:46
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        //1.创建 ”数据源“
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/daily?characterEncodint=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("123456");
        //2.和数据库服务器建立连接
        Connection connection = dataSource.getConnection();
        //3.构造一个操作数据库的sql语句
        String sql = "insert into test values (1,'张三')";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //4.执行sql
        int n = preparedStatement.executeUpdate();
        //5.打印结果
        System.out.println(n);
        //6.回收资源
        preparedStatement.close();
        connection.close();
    }
}
