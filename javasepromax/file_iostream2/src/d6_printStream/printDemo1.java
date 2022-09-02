package d6_printStream;

import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 学会打印流，高效，方便写数据到文件
 */
public class printDemo1 {
    public static void main(String[] args) throws Exception{
        //1.创建一个打印流对象
        PrintStream ps=new PrintStream("file_iostream2/src/ps.txt","gbk");//不支持追加，字节
        PrintWriter pw=new PrintWriter("file_iostream2/src/ps.txt","gbk");//字符
        //追加可以在低级管道追加
//        PrintWriter pw1=new PrintWriter(new FileWriter("file_iostream2/src/ps.txt",true));
        ps.println(97);
        ps.println("\n");
        ps.println('a');
        pw.println("我是傻逼");//写字符进去
        ps.close();
        pw.close();
    }
}
