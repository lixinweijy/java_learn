package JDBC;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
resultSet  用于返回数据库中的资源
 */
public class ResultSetDemo {

    @Test
    public void testDml() throws Exception{
        //2.获取连接，本机的话可以省略 :///db1
        String url="jdbc:mysql://127.0.0.1:3306/db1";
        String username="root";
        String password="root";
        Connection conn= DriverManager.getConnection(url,username,password);

        //3.定义sql
        String sql="select * from account";

        //4.获取statement对象
        Statement stmt=conn.createStatement();

        //5.执行sql
        ResultSet rs=stmt.executeQuery(sql);

        //6.处理结果，遍历rs中的所有数据
        // 6.1 光标向下移动一行，并且判断当前行是否有数据
        while(rs.next()){
            // 6.2 获取数据 getXxx()
            int id=rs.getInt(1);
            String money=rs.getString(2);
            System.out.println("id:" + id + "\tmoney:" + money);
        }

        rs.close();
        stmt.close();
        conn.close();
    }
}
