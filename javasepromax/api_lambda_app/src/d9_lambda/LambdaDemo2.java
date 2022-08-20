package d9_lambda;
//简洁
public class LambdaDemo2 {
    public static void main(String[] args) {
        //目标：学会使用Lambda的标准格式简化匿名内部类的代码形式
//        Swimming s1=new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("我不会游泳，死");
//            }
//        };
        Swimming s1=()->{
            System.out.println("我溺水而亡");
        };
        go(s1);
        System.out.println("---------------------------");
        go(()->{
            System.out.println("我再次溺水而亡");
        });
    }

    public static void go(Swimming s){
        System.out.println("开始。。");
        s.swim();
        System.out.println("结束");
    }
}

@FunctionalInterface    //一旦加上这个注解必须是函数式接口，里面只能有一个抽象方法
interface Swimming{
    void swim();
}