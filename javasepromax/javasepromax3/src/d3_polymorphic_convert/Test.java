package d3_polymorphic_convert;

public class Test {
    public static void main(String[] args) {
        //自动类型转换：
        Animal a=new Dog();
        a.run();

        //强制类型转换：
        Animal a2=new Tortoise();
//        a2.layEggs()
        a2.run();

        Tortoise t=(Tortoise) a2; //从父类类型到子类类型，必须强制类型转换
        t.layEggs();

//        Dog d=(Dog)a2;//强制类型转换，编译阶段不报错（注意：有继承或者实现关系编译阶段可以强制装换，没有问题），运行是可能出错
        //为了防止上面的情况出现，要用instanceof
        if (a2 instanceof Tortoise){
            Tortoise t1=(Tortoise) a2;
            t.layEggs();
        }else if(a2 instanceof Dog){
            Dog d=(Dog) a2;
            d.lookDoor();
        }
    }

}
