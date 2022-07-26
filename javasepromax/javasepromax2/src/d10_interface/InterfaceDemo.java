package d10_interface;

/**
 * 声明一个接口
 */
public interface InterfaceDemo {
    //目标：接口中的成分特点，JDK 8之前接口中只能有抽象方法和常量
    //1.常量：
    // 注意：由于接口体现规范思想，规范默认都是公开的，所以代码层面，public abstract final可以省略不写。
    String SCHOOL_NAME="长江大学";
    //2.抽象方法

    // 注意：由于接口体现规范思想，规范默认都是公开的，所以代码层面，public abstract 可以省略不写。
    void eat();
    void run();

}
