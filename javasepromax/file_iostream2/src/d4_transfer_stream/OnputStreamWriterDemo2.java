package d4_transfer_stream;

import java.io.*;
/*
方法1
getByte("UTF-8");
方法二
OutputStreamWriter(数据,"UTF-8");
 */
public class OnputStreamWriterDemo2 {
    public static void main(String[] args) throws Exception{
        //代码UTF-8   文件UTF-8
        //1.提取GBK文件的原始字节流
        OutputStream os=new FileOutputStream("file_iostream2/src/data_gbk(1).txt");
        //2.把原始字节流转换成字符输入流
        Writer osw=new OutputStreamWriter(os,"GBK");
        //3.上车
        BufferedWriter bw=new BufferedWriter(osw);
        bw.write("我爱你中国~");

        bw.close();

    }
}
