package d13_interface_jdk8;

public interface SportManInter{
    /**
     * 1.JDK 8开始 ：默认方法
     * -- 必须default修饰，默认用public修饰
     * -- 默认方法，接口不能创建对象，争光方法只能过继给实现类，由实现类的对象调用
     */
    default void run(){
        go();
        System.out.println("跑的很快~~");
    }

    /**
     * 2.静态方法
     * 必须使用static修饰，默认用public修饰
     * --接口的静态方法，必须接口名自己调用
     */
    static void inAddr(){
        System.out.println("我们都在学习Java新增方法的语法，他是Java源码自己会用到的~~");
    }

    /**
     * 3.私有方法
     * --JDK 1.9开始支持
     * 必须在接口内部才能被访问
     */
    private void go(){
        System.out.println("开始跑~~");
    }

}


class PingPongMan implements SportManInter{

}
class Test{
    public static void main(String[] args) {
        PingPongMan p=new PingPongMan();
        p.run();
        SportManInter.inAddr();  //只能用这个接口调用
//        PingPongMan.inAddr()  不能用这个类调用
    }
}