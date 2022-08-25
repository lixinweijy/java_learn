package d1_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("lxw");
        list.add("yt");
        list.add("zj");
        list.add("zs");
        list.add("ls");
        list.add("ww");
        //filter  过滤元素  forEach遍历
        list.stream().filter(s -> s.startsWith("l")).filter(s -> s.length()==2).forEach(s -> System.out.println(s));
        //count 计数
        System.out.println(list.stream().filter(s -> s.length() == 2).count());

        //limit:取前几个元素

        //skip跳过前几个元素

        //map 加工方法  第一个参数原材料 -> 第二个参数时加工后的结果
        list.stream().map(s->"垃圾"+s).forEach(z->System.out.println(z));


        //把所有名称加工成一个学生对象
        list.stream().map(s->new Student(s)).forEach(s->System.out.println(s));
//        list.stream().map(Student::new).forEach(System.out::println);  和上面效果一致

        //concat 合并流
        Stream<String>s1=list.stream().filter(s -> s.startsWith("l"));
        Stream<String>s2=list.stream().filter(s -> s.startsWith("z"));
        Stream.concat(s1, s2).forEach(s -> System.out.println(s));
    }
}
