package d9_api_object;

/**
 * 目标：掌握Object类中toString方法的使用
 */
//默认返回当前对象在堆内存中的地址信息：类的全限名@内存地址
//存在的意义就是被重写
public class Test1 {
    public static void main(String[] args){
        Student s=new Student("李新伟",'男',20);
        String rs=s.toString();
        System.out.println(rs);//打印地址
        //直接输出对象变量，默认可以省略toString不写
        System.out.println(s);
    }
}
