package d5_resource_release;

import java.io.*;

//JDK9改进方法

public class TryCatchFinallyDemo3 {
    public static void main(String[] args) throws Exception {
        //1.创建一个字节输入流管道与源文件接通
        InputStream inputStream= new FileInputStream("file_iostream/src/data.txt");
        //2.创建一个字节输出流管道与目标文件接通
        OutputStream outputStream=new FileOutputStream("file_iostream/src/data(1).txt");
        //这里面只能放置资源对象，用完会自动关闭，自动调用资源对象（即使出现一次）
        //实现了close接口的方法才是资源
        try (inputStream;outputStream ){
            //3.定义一个字节数组转移数据
            byte[] buffer=new byte[1024];
            int len;
            while((len=inputStream.read(buffer))!=-1){
                outputStream.write(buffer,0,len);
            }
            outputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
