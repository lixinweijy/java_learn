package d7_innerclass;

import d3_polymorphic_convert.Dog;
import d6_innerclass.Outer;

/**
 * 目标：了解局部类的语法
 */
public class Test {

    static {//这里也可以定义一个局部内部类
        class Dog{//局部内部类不能用public修饰，因为只有这里用，其他位置也不需要使用

        }
        abstract class Animal{//抽象类，没必要

        }

        interface SportManInter{

        }

    }

    public static void main(String[] args) {

        class Cat{  //不要这么写，虽然可以，不过没什么意义，这个模块封装的不太行
            private String name;

            public static int onlienNumber=100;
            public Cat() {
            }
            private static int aa=10;

            public Cat(String name, int age, String sex) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        Cat c=new Cat();
        Dog a=new Dog();
        System.out.println(Cat.aa);
        c.setName("叮当猫~");
    }
}
