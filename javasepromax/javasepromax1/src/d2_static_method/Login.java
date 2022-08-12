package d2_static_method;

public class Login {
    public static void main(String[] args) {
        String yzm=Tool.CreateVerifyCode(5);
        System.out.println(yzm);
    }
}