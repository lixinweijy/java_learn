package d9_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarAgentProxy {
    /*
    设计一个方法来返回一个明星对象对的代理对象
     */
    public static Skill getProxy(Star s){
        //为明星生成一个代理对象
        return (Skill) Proxy.newProxyInstance(s.getClass().getClassLoader(), s.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //外面调用的方法走这个代理,真正让杨超越去唱歌跳舞
                Object rs=method.invoke(s,args);//method 代表正在调用的方法对象，args 代表这个方法的参数
                System.out.println("收尾款，把杨超越接回来....");
                return rs;
            }
        });
    }

}
