package d4_reflect_filed;

import org.junit.Test;

import java.lang.reflect.Field;

public class FiledDemo1 {
    /**
     * 1.获取全部的成员变量
     * Field[] getDeclaredFields();
     *      获得所有的成员变量对应的Field对象，只要申明了就可以得到
     */
    @Test
    public void getDeclaredField(){
        //a.定位Class对象
        Class c=Student.class;
        //b.定位全部成员变量
        Field[] fields=c.getDeclaredFields();
        //c.遍历一下
        for (Field f : fields) {
            System.out.println(f.getName() + "==>" + f.getType());
        }
    }
    /**
     * 2.获取某个成员变量对象 Field getDeclareField(String name)
     */
}
