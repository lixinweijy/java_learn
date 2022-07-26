package com.itheima.hello.constructor;

public class Test {
    public static void main(String[] args) {
        //通过调用构造器得到对象
        Car c=new Car();
        c.name="宝马";
        c.price=11.1;
        System.out.println(c.name);
        System.out.println(c.price);

        //调用有参数构造器
        Car c1=new Car("奔驰",22.2);
        System.out.println(c1.name);
        System.out.println(c1.price);
    }
}
