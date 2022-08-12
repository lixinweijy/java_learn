package d8_innerclass_anonymous;

/**
 * 目标：掌握匿名内部类的使用形式
 */

public class Test2 {
    public static void main(String[] args) {
        Swimming s=new Student();
        go(s);

        Swimming ss=new Swimming() {//2.使用匿名内部类
            @Override
            public void swim() {
                System.out.println("学生们都在游泳");
            }
        };
        go(ss);
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("运动员游的贼快");
            }
        });
    }
    /**
     * 学生、老师、运动员一起参加游泳比赛
     */
    public static void go(Swimming s){
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }
}
class Student implements Swimming{//1.继承接口
    @Override
    public void swim(){
        System.out.println("学生快乐的游泳");
    }
}
interface Swimming{
    void swim();
}