package d12_this;

public class Test {
    public static void main(String[] args) {
        //目标：理解this(...)的作用，本类构造器中访问本类兄弟构造器
        Student s1=new Student("李新伟","长江大学");
        Student s2=new Student("袁涛");
        System.out.println(s1.getName());
        System.out.println(s1.getSchoolName());

        System.out.println(s2.getName());
        System.out.println(s2.getSchoolName());
    }
}
