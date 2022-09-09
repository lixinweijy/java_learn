package d10_proxy2;

public interface UserService {
    String login(String loginName,String passWord);
    void deleteUsers();
    String selectUsers();
}
