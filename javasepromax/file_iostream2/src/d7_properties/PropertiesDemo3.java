package d7_properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

/*
实际上是一个Map集合，但是一般不当集合使用，因为HashMap更好用
 */
public class PropertiesDemo3 {
    public static void main(String[] args) throws Exception{
        //Properties读取属性文件中的键值对信息
        Properties properties=new Properties();
        System.out.println(properties);

        //加载属性文件中的键值对数据到属性对象properties中去
        properties.load(new FileReader("file_iostream2/src/user.properties"));
        System.out.println(properties);

        String rs=properties.getProperty("admin");
        System.out.println(rs);
    }
}
