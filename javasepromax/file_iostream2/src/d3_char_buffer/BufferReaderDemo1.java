package d3_char_buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/*
使用缓冲字符输入流来提高字符输入流的性能，新增了按照行读取的方法
 */
public class BufferReaderDemo1 {
    public static void main(String[] args) throws Exception{
        try(
                Reader fr=new FileReader("file_iostream2/src/data.txt");
                BufferedReader br=new BufferedReader(fr);
                ){
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
