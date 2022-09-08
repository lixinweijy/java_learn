package d7_reflect_framework;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class MybatisUtil {

    //保存任意类型的对象
    public static void save(Object obj){
        //1、提取这个对象的全部成员变量；只有反射可以解决
        try (
                PrintStream ps=new PrintStream(new FileOutputStream ("junit-reflect-annotation-proxy-app/src/data.txt"));
                ){
            Class c=obj.getClass();
            ps.println("=============="+c.getSimpleName()+"================");
            //2.提取他的全部成员变量
            Field[] fields=c.getDeclaredFields();
            //3.获取成员变量得到信息
            for (Field field: fields) {
                String name=field.getName();
                field.setAccessible(true);
                //提取本成员变量在obj对象中的值（取值）
                String value=field.get(obj)+"";
                ps.println(name+"="+value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
