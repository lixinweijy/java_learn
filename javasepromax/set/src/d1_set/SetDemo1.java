package d1_set;

/**
 * 无序：存取顺序不一致
 * 不重复：可以去除重复
 * 无索引:对外没有支持索引的方法
 */

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet:无序，不重复，无索引
 * LinkHashSet:有序，不重复，无索引  在HashSet的基础上添加双链表记录位置
 * TreeSet:排序，不重复，无索引       基于红黑数的数据结构
 */

public class SetDemo1 {
    public static void main(String[] args) {
        // 看看Set系列集合的特点：HashSet LinkedHashSet TreeSet
        Set<String> sets=new HashSet<>();//多态
        sets.add("Java");
        sets.add("python");
        sets.add("html");
        sets.add("css");
        sets.add("Java");
        sets.add("MySql");
        System.out.println(sets);
    }
}
