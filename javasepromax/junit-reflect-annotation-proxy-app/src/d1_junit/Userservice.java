package d1_junit;

public class Userservice {
    public String loginName(String loginName,String passWord){
        if ("admin1".equals(loginName) && "123456".equals(passWord)){
            return "登陆成功";
        }else {
            return "用户名或者密码有问题";
        }
    }

    public void selectNames(){
        System.out.println(10 / 0);
        System.out.println("查询全部用户名称成功~~");
    }
}
