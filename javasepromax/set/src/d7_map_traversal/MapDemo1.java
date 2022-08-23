package d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo1 {
    /*
    遍历 根据键找值
     */
    public static void main(String[] args) {
        Map<String,Integer> maps=new HashMap<>();
        maps.put("lxw",10);
        maps.put("yt",20);
        maps.put("zj",30);
        System.out.println(maps);

        //键找值:
        //1.第一步，先拿到集合的全部键
        Set<String> keys=maps.keySet();
        //2.第二步，遍历每个键，根据键提取值
        for (String key:keys) {
            int value=maps.get(key);
            System.out.println(key + "==>" + value);
        }

        System.out.println("----------------");
        //遍历键值对
        //1.通过把map集合转化为set类型  entrySet
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();  //ctrl+alt+v自动补全
        System.out.println(entries);
        //2.开始遍历
        for (Map.Entry<String,Integer> entry:entries) {
            System.out.println("key："+entry.getKey());
            System.out.println("value：" + entry.getValue());
        }

        System.out.println("----------");
        //lambda遍历
        maps.forEach((s,integer) -> System.out.println("key:\t"+s+"\t\tvalue:"+integer));
    }
}
