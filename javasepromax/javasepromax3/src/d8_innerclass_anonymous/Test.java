package d8_innerclass_anonymous;

import javax.swing.plaf.synth.SynthLookAndFeel;

/**
 * 目标：学习匿名内部类的形式和特点
 */
public class Test {
    public static void main(String[] args){
        Animal a=new Tiger();//1.通过继承的方法再来调用
        //老规矩，烂笔头，编译看左，运行看右，仅限方法，不限变量
        Animal b=new Animal() {//2.通过匿名的方法调用
            @Override//不能说是animal的对象，他是匿名内部类的对象，也可以说是自己对的对象
            public void run() {
                System.out.println("我是动物哦");
            }
        };
        a.run();
        /*
            匿名内部类是一个没有名字的内部类
            匿名内部类写出来就会产生一个匿名内部类对象
            匿名内部类的对象类型相当于是当前new的那个的类型的子类类型
         */
    }
}

class Tiger extends Animal{
    @Override
    public void run(){
        System.out.println("老虎跑得快~");
    }
}

abstract class Animal{
    public abstract void run();
}