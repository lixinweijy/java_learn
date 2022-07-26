package d6_abstract;

/**
 * 抽象类：作为父类，被用来继承的
 * 如果一个类继承了抽象类，那么这个类必须重写完抽象类的全部抽象方法
 * 否则这个类也必须定义成抽象类
 */
public class Test {
    public static void main(String[] args) {
        //目标：先认识抽象类，再了解它的使用场景
        Dog d=new Dog();
        d.run();
    }
}
