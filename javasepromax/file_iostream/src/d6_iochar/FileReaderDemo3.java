package d6_iochar;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileReaderDemo3 {
    public static void main(String[] args)throws Exception {
        //1.创建一个文件字符输入流和源文件接通
        Writer fw=new FileWriter("file_iostream/src/data(1).txt");//文件指针在最开头，清空数据

        //a.public void write(int c);写一个字符
        fw.write(99);
        fw.write('a');
        fw.write('李');

        //b.写一个字符数组出去
        fw.write("大家好，我是李新伟");

        //c.写字符数组进去
        fw.write("我是傻逼".toCharArray());

        //d.写字符串一部分进去
        fw.write("天道酬勤",0,2);

        //e.写字符数组一部分进去
        fw.write("我是大傻逼".toCharArray(),0,4);
        fw.close();//关闭包含刷新
    }
}
