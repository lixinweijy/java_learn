package d9_proxy;

public class Test {
    public static void main(String[] args) {
        //学习开发出一个动态代理的对象出来，理解动态代理的执行流程
        //1.创建一个对象，对象的类必须实现接口
        Star s=new Star("杨超越");

        //为杨超越对象生成一个代理对象（经纪人）
        Skill s1=StarAgentProxy.getProxy(s);

        s1.jump();//走代理
        s1.sing();


    }
}
