package d4_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/*
字节输入流：以内存为基准，来自磁盘文件/网络中的数据以字节的形式读入到内存中去的流称为字节输入流
字节输出流：以内存为基准，把内存中的数据以字节写出到磁盘文件或者网络中去的流称为字节输出流
字符输入流：以内存为基准，来自磁盘文件/网络中的数据以字符的形式读入到内存中去的流称为字节输入流
字符输出流：以内存为基准，把内存中的数据以字符写出到磁盘文件或者网络中去的流称为字节输出流
 */
public class IoDemo {
    public static void main(String[] args) throws Exception {
        //1、创建一个文件字节输入流管道与源文件接通
        InputStream is =new FileInputStream(new File("./file_iostream/src/data.txt"));

        //2.读取一个字节返回
        int b1=is.read();
        System.out.println((char) b1);

        //读取完毕返回-1
    }
}
