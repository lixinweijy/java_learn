package JDBC;

import org.junit.jupiter.api.Test;

import java.sql.*;

import static com.mysql.cj.conf.PropertyKey.useServerPrepStmts;

/*
 用PreparedStatement来解决sql注入的问题
将敏感字符进行转义
预编译效率更高，对于同一句sql语句只会检查和编译一次
 */
public class PreparedStatementDemo {

    /*
    执行DML语句
     */
    @Test
    public void testDml() throws Exception{
        //2.获取连接，本机的话可以省略 :///db1
        String url="jdbc:mysql://127.0.0.1:3306/db1";
        String username="root";
        String password="root";
        Connection conn= DriverManager.getConnection(url,username,password);

        //3.定义sql语句
        String sql="update account set money = ? where id = ?";

        //4.获取执行sql的对象Statement
        //获取pstmt对象
        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,"100");
        pstmt.setInt(2,1);


        //执行sql
        ResultSet rs=pstmt.executeQuery();

        rs.close();
        pstmt.close();
        conn.close();
    }
}
