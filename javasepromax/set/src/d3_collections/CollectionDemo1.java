package d3_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 目标：Collection工具类的使用
 * java.utils.Collections:是集合工具类
 * Collections并不属于集合，是用来操作集合的工具类
 * Collections有几个常用API：
 *      public static <T> boolen addAll(Collection<? super T> c,T... elements)
 *      给集合对象批量添加元素
 *      public static void shuffle(list<?> list):打乱集合顺序
 *      public static <T> void sort(List<T> list):将集合中的元素按照默认规则排序
 *      public static <T> void sort(List<T> list,Comparator<? super T> c):将集合中元素按照指定规则排序
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();

        //1.addAll()
        Collections.addAll(names,"lxw","yt","zj");
        System.out.println(names);

        //2.shuffle
        Collections.shuffle(names);
        System.out.println(names);

        //3.sort默认规则排序
        Collections.sort(names);
        System.out.println(names);
        //shift + f6重构修改
    }
}
