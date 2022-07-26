package d5_innerclass_static;

public class Outer {
    /**
     * 学习静态成员内部类
     */
    public static class Inner{
        private String name;
        private int age;
        public static String schoolName;
    }
    /**
     * 总结：
     * 如一个类中包含了一个完整的成分，如汽车类中的发动机类
     * 特点、使用与普通类是一样的，类有的成分它都有，只是位置在别人里面而已
     * 可以直接访问外部类的静态成员，不能直接访问外部类的实例成员
     * 注意：开发中实际上用的还是比较少
     */


}
