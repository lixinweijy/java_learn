package d2_static_method;

import java.util.Random;

public class Tool {

    /**
     * 注意：由于工具类无需创建对象，所以把其构造器私有化会显得很专业！
     */
    private Tool(){

    }

    public static String CreateVerifyCode(int n){
        // 开发一个验证码
        // 1.定义一个变量记住验证码
        String code="";
        // 2.定义一个变量记住全部验证码字符
        String data="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        // 3.定义一个循环生成几个随机索引，去得到几个字符
        Random r=new Random();
        for (int i = 0; i < n; i++) {
            int dex=r.nextInt(data.length());
            code+=data.charAt(dex);
        }
        return code;
    }
}
