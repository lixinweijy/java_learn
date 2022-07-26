package d9_extends_override;

public class Test {
    public static void main(String[] args) {
        //目标：认识方法重写
        NewPhone n=new NewPhone();
        n.call();
        n.sendMsg();
    }
}
/**
 * 旧手机，父类
 */

class Phone{
    public void call(){
        System.out.println("打电话");
    }

    public void sendMsg(){
        System.out.println("发短信");
    }
}
/**
 * 新手机：子类
 */

class NewPhone extends Phone{
    //重写的方法
    //1.重写校验注解，加上之后，这个方法必须是正确重写的，这样更安全。
    //2.提高程序的可读性，代码优雅
    /**
     * 注意：
     * 重写方法的名词和形参列表必须与被重写的方法一模一样。
     *私有方法不能被重写
     * 子类重写父类方法时，访问权限必须大于或者等于父类
     * 静态方法不能被重写
     */
    @Override
    public void call() {
        super.call();//先用她爸的基本功能
        System.out.println("开始视频通话");
    }

    @Override
    public void sendMsg() {
        super.sendMsg();
        System.out.println("发图片");
    }
}