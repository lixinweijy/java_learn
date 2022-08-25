package d1_stream;

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
目标：收集Stream流到集合或者数组中去
 */
public class StreamDemo4 {
    public static void main(String[] args) {
        List<String > list=new ArrayList<>();
        list.add("lxw");
        list.add("yt");
        list.add("zj");

        Stream<String >s1=list.stream().filter(s -> s.startsWith("l"));
//        List<String > lstart=s1.collect(Collectors.toList());
        //流只能使用一次，收集之后不能再收集了
        Set<String > ll=s1.collect(Collectors.toSet());

        Stream<String > s2=list.stream().filter(s -> s.startsWith("l"));
//        Object[] arrs=s2.toArray();
//        String[] arrs=s2.toArray( value -> new String[value] );
//          String[] arrs=s2.toArray(String[]::new);
        List<String> arrs=s2.toList();
        System.out.println(arrs);
    }
}
