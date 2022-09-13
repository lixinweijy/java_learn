package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
要处理几个事情的时候，可以开启事务，全部执行成功了再commit，一个失败了就不会commit，也就全部不会成功
 */
public class ConnectionDemo {
    public static void main(String[] args) throws Exception{


        //2.获取连接，本机的话可以省略 :///db1
        String url="jdbc:mysql://127.0.0.1:3306/db1";
        String username="root";
        String password="root";
        Connection conn= DriverManager.getConnection(url,username,password);

        //3.定义sql语句
        String sql="update account set money = 200 where id = 1";
        String sql1="update account set money = 2002 where id = 2";

        //4.获取执行sql的对象Statement
        Statement stmt=conn.createStatement();
        int count= 0;//受影响的行数

        try {
            //开启事务
            conn.setAutoCommit(false);
            //5.执行sql
            count = stmt.executeUpdate(sql);
            int count1=stmt.executeUpdate(sql1);
            int a=3/0;
            conn.commit();
        } catch (Exception e) {
            conn.rollback();
            e.printStackTrace();
        }

        System.out.println(count);
        stmt.close();
        conn.close();
    }
}
