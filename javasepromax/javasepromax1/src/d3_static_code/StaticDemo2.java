package d3_static_code;

public class StaticDemo2 {

    public StaticDemo2(){
        System.out.println("无参构造器被触发执行了");
    }

    /**
     * 实例代码块：无static修饰，属于对象每次构建对象时都会触发一次执行
     * 作用：用于初始化实例资源
     */
    {
        System.out.println("实例代码块被触发执行");
    }
    public static void main(String[] args) {
        //目标：理解实例代码块
        StaticDemo2 s1=new StaticDemo2();
        StaticDemo2 s2=new StaticDemo2();
    }
}
