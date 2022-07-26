package d6_abstract;

/**
 * 抽象类:有abstract修饰
 */

/**
 * 抽象方法只有方法签名，不能声明方法体
 * 一个类中如果定义了抽象方法，这个类必须声明成抽象类，否则报错
 */
public abstract class Animal {
    /**
     * 抽象方法：有abstract修饰，不能写方法体代码
     */
    //方法签名
    public abstract void run();
}
