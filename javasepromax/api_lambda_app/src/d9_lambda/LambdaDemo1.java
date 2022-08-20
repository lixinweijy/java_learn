package d9_lambda;
//Lambda只能简化接口中只有一个抽象方法的匿名内部类形式
public class LambdaDemo1 {
    public static void main(String[] args) {
        //目标：学会使用lambda的标准格式简化匿名内部类的代码格式
        Animal a=new Animal() {
            @Override
            public void run() {
                System.out.println("乌龟跑的很慢");
            }
        };
        a.run();
        //不符合条件，不行
    }
}
abstract class Animal{
    public abstract void run();
}