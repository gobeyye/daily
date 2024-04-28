package test1;

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
 * Date: 2024-04-28
 * Time: 22:07
 */
public class JDBCDemo4 {
    public static void main(String[] args) throws SQLException {
        //1.创建 “数据源”
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/daily?characterEncodint=utf8&useSSL=false");
        ((MysqlDataSource) dataSource).setUser("root");
        ((MysqlDataSource) dataSource).setPassword("123456");
        //2.创建数据库服务器连接
        Connection connection = dataSource.getConnection();
        //3.构造操作数据库sql语句
        String sql = "select * from test1";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //4.执行sql
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            System.out.println("id = " + id + "  name = " + name);
        }
        //5.回收资源
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
