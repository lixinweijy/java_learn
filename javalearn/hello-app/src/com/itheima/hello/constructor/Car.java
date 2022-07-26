package com.itheima.hello.constructor;

public class Car {
    String name;
    double price;

    public Car(){
        System.out.println("无参数构造器被调用了");
    }
    public Car(String a,double b){
        System.out.println("有参数构造器被调用了");
        name=a;
        price=b;
    }
}
