package JDBCDemo2;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HXL
 * Date: 2024-04-30
 * Time: 16:11
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        //1.创建 ”数据源‘
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/daily?characterEncodint=utf8&useSSL=false");
        ((MysqlDataSource)dataSource).setUser("root");
        ((MysqlDataSource)dataSource).setPassword("123456");
        //2.和数据库服务器建立连接
        Connection connection = dataSource.getConnection();
        //3.构造能够操作数据库的sql语句
        String sql = "select * from test";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //4.执行sql
        ResultSet resultSet = preparedStatement.executeQuery();
        //5.返回结果
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println("id = " + id + "  name = " + name);
        }
        //6.回收资源
        resultSet.close();
        preparedStatement.close();
        connection.close();

    }
}
