package d1_set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo4 {
    public static void main(String[] args) {
        /**
         * TreeSet 默认的规则
         * 对于数值类型：Integer，Double，官方默认按照大小进行升序排序
         * 对于字符串类型：默认按照首字符的编号升序排序
         * 对于自定义类型,如Student对象，TreeSet无法直接排序
         */

        /**
         * 目标：观察TreeSet对于有值特性的数据如何排序
         * 学会对自定义类型的对象进行指定规则排序
         */
        Set<Integer> sets=new TreeSet<>();//不重复，无索引，可排序
        sets.add(1);
        sets.add(34);
        sets.add(65);
        sets.add(3);
        System.out.println(sets);

        Set<String> sets1=new TreeSet<>();
        sets1.add("java");
        sets1.add("python");
        sets1.add("c");
        sets1.add("CSS");
        sets1.add("李新伟");

        System.out.println(sets1);

        System.out.println("---------------------------");
        Set<Apple> apples=new TreeSet<>();
        apples.add(new Apple("lxw","红色",9.9,300));
        apples.add(new Apple("yt","白色",19.9,200));
        apples.add(new Apple("zj","绿色",29.9,300));
        apples.add(new Apple("lxw","青色",39.9,500));

        //TreeSet集合存储对象的时候有2种方式可以设计自定义比较规则
        //1.让自定义的类实现Comparable接口重写里面的compareTo方法来定制比较规则
        System.out.println(apples);//去掉一个300，要是不要去掉一样的，可以让返回不为0
        //2.TreeSet自带比较器对象进行规则定制
        Set<Apple> apples1=new TreeSet<>((Apple o1, Apple o2) ->o1.getWeight()-o2.getWeight());//浮点数比较用compare
        apples1.add(new Apple("xx","白色",1,1));
        apples1.add(new Apple("xy","黑色",2,11));
        apples1.add(new Apple("yx","红色",3,12));
        apples1.add(new Apple("yy","蓝色",4,2));
        System.out.println(apples1);

    }
}
