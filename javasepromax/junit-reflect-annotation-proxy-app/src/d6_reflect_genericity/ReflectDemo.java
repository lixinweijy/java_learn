package d6_reflect_genericity;

import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/*
用反射打破泛型的束缚
因为泛型是编译时的限制，而反射是运行是执行的，所以可以打破泛型
 */

public class ReflectDemo {
    public static void main(String[] args) throws Exception{
        //需求：反射实现泛型擦除后，加入其他类型的元素
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        System.out.println(list1.getClass());
        System.out.println(list2.getClass());
        System.out.println(list1.getClass() == list2.getClass());//true     本质都是ArrayList.class

        System.out.println("---------------------");
        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(11);
        list3.add(22);

        Class c=list3.getClass();

        //定位c类中的add方法
        Method add=c.getDeclaredMethod("add", Object.class);
        add.invoke(list3,"sb"); //唤醒add方法，并且调用class和参数

        System.out.println(list3);

        //也可以直接用arraylist变量来接，然后更改
        ArrayList list4=list3;
        list4.add("傻逼");
        list4.add(false);
        System.out.println(list3);
    }
}
