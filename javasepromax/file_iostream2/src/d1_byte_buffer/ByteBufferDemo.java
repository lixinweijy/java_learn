package d1_byte_buffer;

import java.io.*;

public class ByteBufferDemo {
    public static void main(String[] args) throws Exception{
        try(
                //1.创建一个字节输入流管道与原文件接通
                InputStream is=new FileInputStream("file_iostream2/src/data.txt");
                //a.把原始的字节输出流管道与目标文件接通
                InputStream bis=new BufferedInputStream(is);
                //2.创建一个字节输出流管道与目标文件接通
                OutputStream os=new FileOutputStream("file_iostream2/src/data(1).txt");
                //b.把字节输出流管道包装成高级得到缓冲字节输出流管道
                OutputStream bos=new BufferedOutputStream(os);
                ){
            //3.定义一个字节数组转移数据
            byte[] buffer=new byte[1024];
            int len;//记录每次读取字节数
            while((len=bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }
            System.out.println("复制完成了!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
