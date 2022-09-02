package d5_serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
学会对象反序列化：使用对象字节输入流把文件中的对象数据恢复成内存中的Java对象
 */
public class ObjectInputStreamDemo2 {
    public static void main(String[] args) throws Exception{
        //1.创建对象字节输入流管道包装低级的字节输入流管道
        ObjectInputStream is=new ObjectInputStream(new FileInputStream("file_iostream2/src/Serial.txt"));

        //2.调用对象字节输入流的反序列化方法
        Student s=(Student) is.readObject();

        System.out.println(s);
    }
}
