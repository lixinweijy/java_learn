package d6_printStream;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 了解改变输出语句的位置到文件   重定向
 */
public class printDemo2 {
    public static void main(String[] args) throws Exception{
        System.out.println("无丝竹之乱耳");

        //改变输出语句的位置
        PrintStream ps=new PrintStream("file_iostream2/src/lolg.txt");
        System.setOut(ps);//重定向打印到文件中
        System.out.println("无案牍之劳行");
    }
}
