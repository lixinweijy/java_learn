package d3_polymorphic_convert;

import d3_polymorphic_convert.Animal;

public class Dog extends Animal {
    @Override
    public void run(){
        System.out.println("狗跑的很快");
    }

    /**
     * 独有功能
     */
    public void lookDoor(){
        System.out.println("看门");
    }
}
