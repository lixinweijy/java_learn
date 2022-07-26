package d1_static_field;

public class static2 {
    /**
     * 静态成员
     */
    public static int onlienNumber=10;
    public static void test(){
        System.out.println("========test=======");
    }

    /**
     *
     * 实例成员
     */
    private String name;
    public void run(){
        System.out.println(name + "跑得快~~");
    }

    //1.静态方法只能访问静态成员，不能直接访问实例成员
    public static void inAddr(){
        System.out.println(onlienNumber);
        System.out.println(static2.onlienNumber);
        test();
//        System.out.println(name);//不能直接访问实例对象
        static2 s=new static2();
        System.out.println(s.name);  //可以先创建实例对象再访问，不能直接访问
//        run();
    }
    //2.实例方法可以访问静态成员，也可以访问示例成员
    public void gp(){
        System.out.println(static2.onlienNumber);
        System.out.println(onlienNumber);
        test();
        run();
        System.out.println(name);
        System.out.println(this);
    }

    //3.静态方法中不可以出现this关键字
    public static void test1(){
//        System.out.println(this.name);    this只能代表当前对象，静态方法可能直接用类调用，没有实例对象
    }


    public static void main(String[] args) {
        //目标：理解static  访问相关的语法：面试笔试题，或者以后理解程序很重要
    }
}