package d6_innerclass;

public class Test {
    public static void main(String[] args) {
        Outer.Inner in=new Outer().new Inner();
        in.setName("李新伟");
        in.setAge(11);
        in.show();
        Outer.Inner.test();
    }
}
