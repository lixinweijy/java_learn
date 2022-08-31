package d4_io;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 使用文件字节输入流每次读取一个字节数组的数据
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception{
        //1.创建一个文件字节输入流管道与源文件接通
        InputStream is=new FileInputStream("file_iostream/src/data.txt");

//        //2.定义一个字节数组，用于读取字节数组
//        byte[] buffer=new byte[3];
//        int len=is.read(buffer);
//        System.out.println("读取了几个字节：" + len);
//        String rs=new String(buffer,0,len);
//        System.out.println(rs);

        //改进，每次读取一个字节数组
        byte[] buffer=new byte[3];
        int len;//记录每次读取的字节数
        while ((len=is.read(buffer))!=-1){
            //读取多少倒出多少
            System.out.print(new String(buffer, 0, len));
        }
    }
}
