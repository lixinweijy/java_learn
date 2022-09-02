package d3_char_buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

/*
缓冲字符输出流的使用，学会他多出来的一个功能，newLine();
 */
public class BufferedWriteDemo2 {
    public static void main(String[] args) throws Exception{
        Writer fw=new FileWriter("file_iostream2/src/data(1).txt");
        BufferedWriter bw=new BufferedWriter(fw);

        bw.write("dsdsffd");
        bw.newLine();
        bw.close();
        fw.close();
    }
}
