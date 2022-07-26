package d3_polymorphic_convert;

import d3_polymorphic_convert.Animal;

public class Tortoise extends Animal {
    @Override
    public void run(){
        System.out.println("乌龟爬的很慢");
    }
    /**
     * 独有功能
     */
    public void layEggs(){
        System.out.println("乌龟在下蛋");
    }
}
