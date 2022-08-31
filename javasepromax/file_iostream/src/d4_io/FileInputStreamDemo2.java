package d4_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/*
使用文件字节输入流一次读完文件的所有字节，可以解决乱码问题
 */
public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception{
        //1.创建一个文件字节输入流管道与源文件接通
        File f=new File("file_iostream/src/data.txt");
        InputStream is=new FileInputStream(f);

        //2.定义一个字节数组与文件大大小刚刚一样大
        byte[] buffer=new byte[(int)f.length()];
        int len=is.read(buffer);
        System.out.println("读取了多少个字节：" + len);
        System.out.println("文件大小:"+f.length());

        byte[] buffer1=is.readAllBytes();//直接用api代替上面方法
        System.out.println("文件大小1：" + buffer1.length);
    }
}
