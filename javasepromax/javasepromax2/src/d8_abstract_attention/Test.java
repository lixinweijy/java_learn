package d8_abstract_attention;

public class Test {
    public static void main(String[] args) {
        // 目标：理解抽象类的特征和注意事项
        //1. 类有的东西，抽象类都有
        //2.抽象类中可以没有抽象方法，但是有抽象方法的必须是抽象类
        //3.一个类继承了抽象类，必须重写完抽象类的全部抽象方法，否则这个类也必须成抽象类
        //4.不能用abstract修饰变量、代码块、构造器
        //5.抽象类不能创建对象，为什么？
        //反证法：加入抽象类可以创建对象
        //Animal a=new Animal();
        //a.run();  run方法没有方法体

        //6.final与abstract是互斥的
    }
}
