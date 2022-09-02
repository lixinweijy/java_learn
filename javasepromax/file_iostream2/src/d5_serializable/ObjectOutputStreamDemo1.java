package d5_serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
学会对象序列化，使用ObjectOutputStream 把内存中的对象存入到磁盘文件中
 */
public class ObjectOutputStreamDemo1 {
    public static void main(String[] args) throws Exception{
        //1.创建学生对象
        Student s=new Student("李新伟","buguai","111111",21);

        //2.对象序列化：使用对象字节输出流包装字节输出流管道
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("file_iostream2/src/Serial.txt"));

        //3.直接调用序列化方法
        oos.writeObject(s);

        //4.释放资源
        oos.close();
    }
}
