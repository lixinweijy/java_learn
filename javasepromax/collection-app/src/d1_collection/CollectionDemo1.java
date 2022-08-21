package d1_collection;

//集合的祖宗接口

/**                 接口          实现类
 *                               ArrayList
 *                  List
 *                              LinkedList
 *
 * Collection
 *                                           LinkedHashSet
 *                              HashSet
 *                  Set
 *                              TreeSet
 */

import java.util.ArrayList;
import java.util.Collection;

/**
 * List系列集合：添加的元素是有序、可重复、有索引
 *          ArrayList、LinkedList：有序，可重复，有索引
 *
 *  Set系列集合：添加的元素是无须，不重复，无索引
 *          HashSet：无序，不重复，无索引; LinkedHashSet：有序、不重复、无索引
 *          TreeSet：按照大小默认升序排序、不重复、无索引
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        //有序 可重复 有索引
        Collection list=new ArrayList();
        list.add("java");
        list.add("python");
        list.add(11);
        list.add(false);
        System.out.println(list);

        //无序，不重复，无索引
        Collection list1=new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(1);
        System.out.println(list1);

        System.out.println("--------------------");
        Collection<String> list2=new ArrayList<String>();//指定添加类型   输别的类型会报错
        Collection<String> list3=new ArrayList<>(); //JDK 7开始后面的类型可以不写

        //泛型和集合不支持基本类型，只支持引用类型
//        Collection<int> list4=new ArrayList<>();
        Collection<String> list4=new ArrayList<>();
        list4.add("23");
    }

}
