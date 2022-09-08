package d7_reflect_framework;

public class ReflectDemo {
    public static void main(String[] args) throws Exception{
        Student s=new Student();
        s.setName("李新伟");
        s.setClassName("计科12106");
        s.setAge(1000);
        s.setHobby("敲代码");
        s.setSex('男');
        MybatisUtil.save(s);

        Teacher t=new Teacher();
        t.setName("sb");
        t.setSex('女');
        t.setSalary(10000);
        MybatisUtil.save(t);
    }
}
