package d10_cannt_modify_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class UNModifyCollection {
    public static void main(String[] args) {
        /**
         * static <E> List<E> of(E...elements)  创建一个具有指定元素的List集合对象
         * static <E> Set<E> of(E...elements)  创建一个具有指定元素的Set集合对象
         * static <K,V> Map<K,V> of(E...elements)  创建一个具有指定元素的Map集合对象
         */
        //1.不可变List集合
        List<Integer> lists=List.of(111,22,31,21,21);
//        lists.add(1);     报错
        System.out.println(lists);

        //2.不可变Set集合
        Set<String> set=Set.of("aaaa","ddsdasd","dsda");
        System.out.println(set);

        //3.不可变的Map集合
        Map<String ,Integer> map=Map.of("lxw",10,"yt",43);
        System.out.println(map);
    }//不可变，不可变
}
