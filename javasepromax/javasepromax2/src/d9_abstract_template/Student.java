package d9_abstract_template;

public abstract class Student {
    /**
     * 声明了模板方法
     */
    public final void write(){
        System.out.println("\t\t\t\t《我的爸爸》\n    你的爸爸是啥样，来说说：");
        //正文
        System.out.println(wirteMain());

        System.out.println("我的爸爸简直太好了~~");

    }
    public abstract String wirteMain();
}
