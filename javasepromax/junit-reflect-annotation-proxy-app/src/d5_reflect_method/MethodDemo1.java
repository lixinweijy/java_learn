package d5_reflect_method;

import org.junit.Test;

import java.io.ObjectInputStream;
import java.lang.reflect.Method;

public class MethodDemo1 {
    /*
    1.获得类中的所有成员方法对象
     */
    @Test
    public void getDeclareMethods(){
        //a.获取类对象
        Class c=Dog.class;
        //b.提取全部方法：包括私有的
        Method[] methods=c.getDeclaredMethods();
        //c.遍历全部方法
        for (Method method: methods) {
            System.out.println(method.getName() + "返回值类型：" + method.getReturnType()+"参数个数："+method.getParameterCount());
        }
    }
    /**
     * 2.获取某个方法对象
     */
    @Test
    public void getDeclardMethod() throws Exception{
        //a.获取类对象
        Class c=Dog.class;
        //b.提取单个方法对象
        Method m=c.getDeclaredMethod("eat");

        //c.触发方法的执行
        Dog d=new Dog();
        //注意：方法如果没有结果返回，那么返回null
        Object result=m.invoke(d);
        System.out.println(result);
    }

}
