package d10_api_objects;

import java.util.Objects;

/**
 * 目标：掌握objects类的常用方法：equals
 */
public class Test {
    public static void main(String[] args){
        String s1=null;
        String s2=new String("hhh");
//        System.out.println(s1.equals(s2));//留下了隐患，可能出现空指针异常
        System.out.println(Objects.equals(s1, s2));
        System.out.println(Objects.isNull(s1));//true
    }
}
