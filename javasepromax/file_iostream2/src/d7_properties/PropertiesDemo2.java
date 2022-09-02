package d7_properties;

import java.io.FileWriter;
import java.util.Properties;

/*
实际上是一个Map集合，但是一般不当集合使用，因为HashMap更好用
 */
public class PropertiesDemo2 {
    public static void main(String[] args) throws Exception{
        //用Properties把键值对信息存入到属性文件中去
        Properties properties=new Properties();
        properties.setProperty("admin","123456");
        properties.setProperty("dlei","003197");

        System.out.println(properties);
        /*
        params1：保存信息
        params2：说明信息
         */
        properties.store(new FileWriter("file_iostream2/src/user.properties"),"this is a user!");//api会自动关闭通道
    }
}
