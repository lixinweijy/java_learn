package d1_polymorphic;

public class Dog extends Animal{
    public String name="修勾";
    @Override
    public void run() {
        System.out.println("修勾跑得快");
    }
}
