package d5_resource_release;

import java.io.*;

public class TryCatchFinallyDemo1 {
    public static void main(String[] args) {
        InputStream inputStream=null;
        OutputStream outputStream=null;
        try {
            //1.创建一个字节输入流管道与源文件接通
            inputStream= new FileInputStream("file_iostream/src/data.txt");

            //2.创建一个字节输出流管道与目标文件接通
            outputStream=new FileOutputStream("file_iostream/src/data(1).txt");

            //3.定义一个字节数组转移数据
            byte[] buffer=new byte[1024];
            int len;
            while((len=inputStream.read(buffer))!=-1){
                outputStream.write(buffer,0,len);
            }
            outputStream.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }finally {//一定要执行，前面有return都不行，除非虚拟机退出
            try {
                if(outputStream!=null) outputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try{
                if(inputStream!=null) inputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
