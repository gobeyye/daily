package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-28
 * Time: 21:30
 */

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 修改表值
 */
public class JDBCDemo2 {
    public static void main(String[] args) throws SQLException {
        //1.创建 “数据源”
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/daily?characterEncodint=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("123456");
        //2.与数据库服务器建立连接
        Connection connection = dataSource.getConnection();
        //3.构造操作数据库的sql语句
        String sql = "update test1 set name = 'aaa' where name = '张三'";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //4.执行sql语句
        int n = preparedStatement.executeUpdate();
        System.out.println(n);
        //5.回收资源
        preparedStatement.close();
        connection.close();
    }
}
