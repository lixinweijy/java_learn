package d6_map_api;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer>maps=new HashMap<>();
        //1.put加元素
        maps.put("lxw",100);
        maps.put("yt",1);
        maps.put("zj",-100);
        maps.put("lxw",10000);
        System.out.println(maps);

        //2.clear清空集合
//        maps.clear();
//        System.out.println(maps);

        //3.判断集合是否为空，为空返回true，反之
        System.out.println(maps.isEmpty());

        //4.根据键获取对应值：public V get(Object key)
        System.out.println(maps.get("lxw"));

        //5.根据键删除整个元素，（删除键回返回键的值）
        System.out.println(maps.remove("lxw"));

        //6.判断是否包含某个键，包含返回true，反之
        System.out.println(maps.containsKey("zj"));

        //7.判断是否包含某个值
        System.out.println(maps.containsValue(100));

        //8.获取全部键的集合，public Set<K> keySet()
        Set<String> keys=maps.keySet();
        System.out.println(keys);

        System.out.println("---------------");

        //9.获取全部值的集合 Collection<V> values();
        Collection<Integer> values=maps.values();
        System.out.println(values);

        //10.集合大小
        System.out.println(maps.size());

        //11.合并其它Map集合
        Map<String,Integer> map1=new HashMap<>();
        Map<String,Integer> map2=new HashMap<>();
        map1.put("java",1);
        map1.put("python",2);
        map1.put("mysql",3);

        map2.put("c",4);
        map1.put("java",5);

        map1.putAll(map2);
        System.out.println(map1);

    }
}
