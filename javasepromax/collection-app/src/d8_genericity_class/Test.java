package d8_genericity_class;

public class Test {
    public static void main(String[] args) {
        //模拟ArrayList定义一个MyArrayList，关注泛型设计
        MyArrayList<String> list=new MyArrayList<>();   //设置的String，之后就是操作String
        list.add("1");
        System.out.println(list);
    }
}
