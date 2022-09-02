package d4_transfer_stream;

import java.io.*;

public class InputStreamReaderDemo1 {
    public static void main(String[] args) throws Exception{
        //代码UTF-8   文件UTF-8
        //1.提取GBK文件的原始字节流
        InputStream is=new FileInputStream("file_iostream2/src/data_gbk.txt");
        //2.把原始字节流转换成字符输入流
        Reader isr=new InputStreamReader(is,"GBK");//默认是以UTF-8的方式转换成字符流，还是会乱码的  和直接使用FileRead是一样的
        //3.上车
        BufferedReader br=new BufferedReader(isr);
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }

    }
}
