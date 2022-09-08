package d4_reflect_filed;

import org.junit.Test;

import java.lang.reflect.Field;
//反射：原本是对象把成员改，反射是成员让对象改
/**
 * Field的方法：给成员变量取值和赋值
 *      void set(Object obj,Object value);给对象注入某个成员变量数据
 *      Object get(Object obj); 获取对象的成员变量的值
 *      void setAccessible(true);暴力反射，设置为可以直接访问私有类型的属性
 *      Class getType();    获取属性的类型，返回Class对象
 *      String getName();   获取属性的名称
 */
public class FiledDemo2 {
    @Test
    public void setField() throws Exception{
        //a.反射第一步，获取类对象
        Class c=Student.class;
        //b.提取某个成员变量
        Field ageF=c.getDeclaredField("age");

        //暴力打开权限
        ageF.setAccessible(true);

        //c.赋值
        Student s=new Student();
        ageF.set(s,18);
    }
}
