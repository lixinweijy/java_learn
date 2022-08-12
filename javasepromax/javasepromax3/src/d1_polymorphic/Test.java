package d1_polymorphic;

/**
 * 目标：认识多态，理解多态的形式和概念
 */
public class Test {
    public static void main(String[] args) {
        //1.多态的形式:   父类类型  对象名称=new 之类构造器
        Animal a=new Dog();
        a.run(); //方法编译看左边，运行看右边
        System.out.println(a.name); //变量编译看左边，运行看左边

        Animal a1=new Tortoise();
        a1.run(); //方法编译看左边，运行看右边
        System.out.println(a1.name); //变量编译看左边，运行看左边

    }
}
