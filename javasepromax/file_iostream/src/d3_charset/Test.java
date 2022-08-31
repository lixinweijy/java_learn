package d3_charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 目标：学会自己进行文字的编码和解码
 */
public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //1.编码：把文字转换成字节（使用指定的编码）
        String name="abc我爱你中国";
        byte[] bytes=name.getBytes();//以当前代码默认字符集进行编码（UTF-8）
        System.out.println(Arrays.toString(bytes));

        //2.解码：八字结装换成对应的中文形式（编码前和编码后的字符集必须一致）
        String rs=new String(bytes,"UTF-8");//默认UTF-8
        System.out.println(rs);
    }
}
