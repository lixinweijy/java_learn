package d4_iobyte;

import java.io.*;

/*
使用字节流完成文件的复制（支持一切文件类型的复制）
 */
public class FileCopyDemo {
    public static void main(String[] args)throws Exception {
        try {
            //1.创建一个字节输入流管道与源文件接通
            InputStream inputStream= new FileInputStream("file_iostream/src/data.txt");

            //2.创建一个字节输出流管道与目标文件接通
            OutputStream outputStream=new FileOutputStream("file_iostream/src/data(1).txt");

            //3.定义一个字节数组转移数据
            byte[] buffer=new byte[1024];
            int len;
            while((len=inputStream.read(buffer))!=-1){
                outputStream.write(buffer,0,len);
            }
            outputStream.flush();
            outputStream.close();
            inputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
