package d6_extends_test;

public class Test {
    public static void main(String[] args) {
        //目标：理解继承的设计思路
        Student s=new Student();
        s.setName("lxw");
        s.setAge(111);
        s.queryCourse();//父类的
        s.writeInfo();//子类的
    }
}
