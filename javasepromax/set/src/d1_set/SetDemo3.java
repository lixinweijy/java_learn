package d1_set;

import java.util.HashSet;
import java.util.Set;

/**
 * 目标：让Set集合把重复内容的对象去掉一个（去重复）
 */

public class SetDemo3 {
    public static void main(String[] args) {
        //Set集合去重复原因：先判断哈希值，再判断equals
        Set<Stuednt> sets=new HashSet<>();
        Stuednt s1=new Stuednt("lxw",18,'男');
        Stuednt s2=new Stuednt("yt",18,'男');
        Stuednt s3=new Stuednt("lxw",18,'男');
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        sets.add(s1);
        sets.add(s2);
        sets.add(s3);
        System.out.println(sets);
    }
}
