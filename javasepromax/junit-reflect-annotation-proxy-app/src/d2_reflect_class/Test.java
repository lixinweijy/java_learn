package d2_reflect_class;
/*
反射第一步：获取class对象
    三种方式：   Class c1=Class.forName("全类名");
               Class c2=类名.class
               Class c3=对象.getClass();
 */
public class Test {
    public static void main(String[] args) throws Exception{
        //1.class类中的一个静态方法：forName(全限名：包名+类名)
        Class c=Class.forName("d2_reflect_class.Student");
        System.out.println(c);

        //2.类名.class
        Class c1=Student.class;
        System.out.println(c1);

        //3.对象.getClass() 获取对象对应类的Class对象
        Student s=new Student();
        Class c2=s.getClass();
        System.out.println(c2);
    }
}
