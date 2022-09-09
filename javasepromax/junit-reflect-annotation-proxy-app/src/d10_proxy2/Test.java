package d10_proxy2;

/*
代理

可以在不改变方法源码的情况下，实现对方法功能的增强，提高代码的复用
简化了编程工作、提高了开发效率，同时提高了软件系统的可拓展性
可以为被代理对象的所有方法做代理
非常的灵活，支持任意接口类型的实现类对象做代理，也可以直接为接口本身做代理
 */

public class Test {
    public static void main(String[] args) {
        //目标：掌握使用动态代理解决问题，理解使用动态代理的优势
        UserService userService=ProxyUtill.getProxy(new UserServiceImpl());
        System.out.println(userService.login("admin", "123456"));
        userService.deleteUsers();
        System.out.println(userService.selectUsers());
    }
}
