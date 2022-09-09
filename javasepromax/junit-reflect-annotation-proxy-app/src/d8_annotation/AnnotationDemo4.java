package d8_annotation;

import java.lang.reflect.Method;

public class AnnotationDemo4 {
    @MyTest
    public void test1(){
        System.out.println("Test1");
    }
    @MyTest
    public void test2(){
        System.out.println("Test2");
    }
    public void test3(){
        System.out.println("Test3");
    }
    /*
      启动菜单
     */
    public static void main(String[] args) throws Exception{
        AnnotationDemo4 t=new AnnotationDemo4();
        //a.获取类对象
        Class c=AnnotationDemo4.class;
        //b.获取全部方法
        Method[] methods=c.getDeclaredMethods();
        //c.遍历方法，查看是否有MyTest注解，如果有，执行它
        for (Method method:
             methods) {
            if(method.isAnnotationPresent(MyTest.class)){
                //唤醒
                method.invoke(t);
            }
        }
    }
}
