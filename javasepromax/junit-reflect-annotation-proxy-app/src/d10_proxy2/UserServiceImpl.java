package d10_proxy2;

public class UserServiceImpl implements UserService{


    @Override
    public String login(String loginName, String passWord) {
        String rs="登录名称或密码错误";
        if("admin".equals(loginName) && "123456".equals(passWord)){
            rs="登陆成功";
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public void deleteUsers() {
        try {
            Thread.sleep(2500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String selectUsers() {
        String rs="查询了10000个用户";
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;

    }
}
