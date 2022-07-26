package d2_modifier;


/**
 * 成员变量一般私有
 * 方法一般公开
 * 如果只希望本类访问，使用private修饰
 * 如果该成员只希望本类，同一个包下的其他类和子类访问，使用protected
 */


public class Test {
    public static void main(String[] args) {
        // 目标：理解权限修饰符的修饰范围。明白每一种修饰后的作用范围
        Fu f=new Fu();
//        f.privateMethod();  报错
        f.Method();
        f.protectedMethod();
        f.publicMethod();
    }
}
