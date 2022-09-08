package d5_reflect_method;

public class Dog {
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println("狗跑的贼快");
    }
    public void eat(){
        System.out.println("狗吃骨头");
    }

    private String eat(String name){
        System.out.println(name + "吃固投");
        return "好帅";
    }

    public static void inAddr(){
        System.out.println("学习黑马java");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
