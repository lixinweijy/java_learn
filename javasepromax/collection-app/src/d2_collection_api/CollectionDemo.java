package d2_collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class CollectionDemo {
    public static void main(String[] args) {
        //HashSet:添加的元素是无序，不重复，无索引
        Collection<String>  list=new ArrayList<>();
        //1.添加元素，添加成功返回true
        System.out.println(list.add("1"));
        list.add("java");
        list.add("python");
        list.add("aaa");
        //2.清空集合元素
//        list.clear();

        //3.判断集合是否为空
        System.out.println(list.isEmpty());

        //4.获取集合大小
        System.out.println(list.size());

        //5.判断集合是否包含某个元素
        System.out.println(list.contains("2"));

        //6.删除某个元素，如果重复删除第一个
        System.out.println(list.remove("1"));

        //7.把集合转换成数组
        Object[] arrs=list.toArray();   //用object接  因为可以通过一些方式在String类型的集合中添加非String类型的数据
        System.out.println("数组" + Arrays.toString(arrs));

        System.out.println("______________________拓展___________________");

        Collection<String> c1=new ArrayList<>();
        c1.add("lxw");
        c1.add("yt");
        c1.add("zj");
        Collection<String> c2=new ArrayList<>();
        c2.add("python");
        c2.add("c++");
        c2.add("c");

        c1.addAll(c2);
        System.out.println(c1);

    }
}
