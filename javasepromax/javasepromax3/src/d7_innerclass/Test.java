package d7_innerclass;

import d6_innerclass.Outer;

/**
 * 目标：了解局部类的语法
 */
public class Test {

    static {
        class Dog{

        }
    }

    public static void main(String[] args) {

        class Cat{
            private String name;

            public static int onlienNumber=100;
            public Cat() {
            }

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
        c.setName("叮当猫~");
    }
}
