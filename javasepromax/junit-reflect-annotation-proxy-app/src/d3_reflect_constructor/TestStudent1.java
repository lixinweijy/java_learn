package d3_reflect_constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestStudent1 {
    /**
     * 1.getConstructors:
     * 获取全部的构造器:只能获取public修饰的构造器
     *
     * Constructor[] getConstructors()
     */
    @Test
    public void getConstructors(){
        //a.第一步，获取类对象
        Class c=Student.class;
        //b.提取类中的全部的构造器对象
        Constructor[] constructors=c.getConstructors();
        //c.遍历构造器
        for (Constructor constructor: constructors) {
            System.out.println(constructor.getName() + "==>" + constructor.getParameterCount());

        }
    }

    /**
     * 2.getDeclaredConstructors();
     * 获取全部的构造器：只要你敢写，这里就能拿到，无所谓权限
     */

    /**
     * 3.getConstructor(Class... parameterTypes)
     * 获取某个构造器，只能拿public修饰的某个构造器
     */

    /**
     * 4.getDeclaredConstructor
     * 获取某个构造器，无所谓权限是否可及
     */
}
