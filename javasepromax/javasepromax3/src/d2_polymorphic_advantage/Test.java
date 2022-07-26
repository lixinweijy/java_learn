package d2_polymorphic_advantage;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Animal d=new Tortoise();
        go(d);

        Animal d1=new Dog();
        go(d1);
//        d1.lookDoor();  多态下不能访问子类独有的功能
    }
    /**
     * 要求：所有的动物都可以进来比赛
     */
    public static void go(Animal a){
        System.out.println("开始..");
        a.run();
        System.out.println("结束");
    }
}
