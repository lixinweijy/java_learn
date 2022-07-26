package d7_extends_feature;
/**
 * 1.子类可以继承父类的属性和行为，但是子类不能继承父类的构造器
 * 2.Java是单继承模式：一个类只能继承一个直接父类
 * 3.Java不支持多继承，但是支持多层继承
 * 4.Java中所有的类都是Object类的子类
 *
 */
public class Test {
    public static void main(String[] args) {
        //目标：理解继承的特点
        //1.子类不能继承父类的构造器
        //2.子类是否可以继承父类的私有成员？  有争议  认为可以继承父类的私有成员，只是不能直接访问
        Tiger t=new Tiger();
//        t.eat();
        //3.子类是否可以继承父类的静态成员。认为不算继承，只是共享的
        System.out.println(Tiger.location);
    }
}

class Animal{
    private void eat(){
        System.out.println("动物要吃东西");
    }

    public static String location="湖北荆州";
}

class Tiger extends Animal{
//    private void e(){}

}
