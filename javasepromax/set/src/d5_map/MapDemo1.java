package d5_map;

import java.util.HashMap;
import java.util.Map;

/**
 * 目标：认识Map体系的特点，同python字典（dict）
 *  无序，不重复，无索引，值不做要求
 *  后面重复的键覆盖前面
 *  键值都可以是null
 *
 * HashMap: 元素按照键是无序，不重复，无索引，值不做要求
 * LinkedHashMap:   元素按照键是有序，不重复，无索引，值不做要求
 * TreeMap：  元素按照键是排序，不重复，无索引的，值不做要求
 *
 */
public class MapDemo1 {
    public static void main(String[] args) {
        //1.创建一个Map集合对象
        Map<String,Integer>maps=new HashMap<>();//经典代码
        maps.put("python",3);
        maps.put("java",2);
        maps.put("c",1);
        maps.put("枸杞",100);
        maps.put(null,null);
        System.out.println(maps);
    }
}
