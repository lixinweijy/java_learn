package d9_api_object;

public class Test2 {
    public static void main(String[] args){
        Student s1=new Student("李新伟",'男',20);
        Student s2=new Student("袁涛",'女',20);
        //equals默认是比较两个对象的地址是否相同
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);//也是比较地址
    }
}//让子类重写，以便比较两个子类对象的内容
