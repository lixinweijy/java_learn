package d1_static_field;

public class demo1 {
    public static void main(String[] args) {
        //目标：理解static修饰成员变量的作用的访问特点
        //1.类名，静态成员变量
        System.out.println(User.onlineNumber);

        User z=new User();
        z.onlineNumber++;  //新来一个人
        System.out.println(z.onlineNumber);
        // 一般来说，静态方法是可以用类名和示例对象来调用
        // 而示例方法不能用类调用，需要用示例对象，加static的方法为静态方法
        /**
         * 示例成员方法:属于对象的，只能用对象触发访问
         */

        /**
         * 静态成员方法:有static修饰，归属于类，可以被共享访问，用类名或者对象名都可以访问
         */

        /**
         * 使用场景：
         * 示例成员方法:表示对象自己的行为的，且方法中需要访问示例成员的，则该方法必须声明为例方法
         * 静态成员方法:如果该方法是以执行一个共用功能为目的，则可以申明为静态方法
         */
    }

}
