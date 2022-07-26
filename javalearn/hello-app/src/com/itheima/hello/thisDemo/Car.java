package com.itheima.hello.thisDemo;

public class Car {
    String name;
    double price;

    /**
     * 无参数构造器
     * */
    public Car(){
        System.out.println("无参数构造器中的this:" + this);
    }

    public Car(String name,double price){
        this.name=name;
        this.price=price;
    }
    public void run(){
        System.out.println("方法中的this" + this);

    }
}
