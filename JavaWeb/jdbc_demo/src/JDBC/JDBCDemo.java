package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
用来连接各种数据库
 */
public class JDBCDemo {
    public static void main(String[] args) throws Exception{
        //1.注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
        //mysql5 之后的java包不需要注册


        //2.获取连接，本机的话可以省略 :///db1
        String url="jdbc:mysql://127.0.0.1:3306/db1";
        String username="root";
        String password="root";
        Connection conn= DriverManager.getConnection(url,username,password);

        //3.定义sql语句
        String sql="update account set money = 200 where id = 1";

        //4.获取执行sql的对象Statement
        Statement stmt=conn.createStatement();

        //5.执行sql
        int count=stmt.executeUpdate(sql);//受影响的行数

        System.out.println(count);
        stmt.close();
        conn.close();
    }
}
