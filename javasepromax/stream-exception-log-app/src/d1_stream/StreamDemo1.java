package d1_stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * 集合获取流的API
 *  default Stream<E> stream();
 *
 * 小结：
 *  集合获取Stream流用：stream();
 *  数组：Array.stream(数组) / Stream.of(数组);
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        /**
         * Collection集合获取流
         */
        Collection<String> list=new ArrayList<>();
        Stream<String> s=list.stream();

        /**
         * Map集合获取流
         */
        Map<String,Integer> maps=new HashMap<>();
        //键流
        Stream<String> keyStream=maps.keySet().stream();
        //值流
        Stream<Integer> valueStream=maps.values().stream();
        //键值对流（拿整体）
        Stream<Map.Entry<String,Integer>> keyvalueStream=maps.entrySet().stream();

        /**
         * 数组获取流
         */
        String[] names={"lxw","yt","zj"};
        Stream<String> nameStream= Arrays.stream(names);

        Stream<String> nameStream1=Stream.of(names);
    }
}
