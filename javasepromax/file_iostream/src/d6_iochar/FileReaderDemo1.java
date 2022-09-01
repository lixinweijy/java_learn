package d6_iochar;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
//在编码一致的情况下不会出现乱码
public class FileReaderDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：每次读取一个字符
        //1.创建一个字符输入流管道与源文件接通
        Reader fr=new FileReader("file_iostream/src/data.txt");

        //2.读取一个字符，返回编号，读完了返回-1
        int code=fr.read();
        System.out.println((char) code);

        //3.使用循环读取字符
        while ((code= fr.read())!=-1){
            System.out.print((char) code);
        }
    }
}
