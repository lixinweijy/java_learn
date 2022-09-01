package d4_iobyte;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamDemo1 {
    public static void main(String[] args) throws Exception{
        //1.创建一个文件字节输出流管道与目标文件接通
        OutputStream os=new FileOutputStream("file_iostream/src/data.txt");//默认是重写管道
//        OutputStream os=new FileOutputStream("file_iostream/src/data.txt",ture);//加true是追加管道
        //2.写数据出去
        //a. public void write(int a);写一个字节进去
        os.write('a');
        os.write(98);//int内容小于256还是一个字节的
        //写数据必须刷新数据，不刷新可能出错
        os.flush();//流还可以继续使用
        os.write('李');
        os.flush();

        //b.public void write(byte[] buffer)写一个数组进去
        byte[]  buffer={'a',98,97,99};
        os.write(buffer);
        byte[] buffer2="我是中国人".getBytes("UTF-8");//一次只能一个字节，中文不止一个字节，要装换成字节数组才行
        os.write(buffer2);
        os.write(buffer2,0,3);//写“我”
        os.write("\r\n".getBytes());//\n在windows系统代表换行，但是在其他系统不一定，加一个\r增加可拓展性


        os.close();//释放资源，释放之后流就不能再使用了

    }
}
