package d9_map_HashMap;

import java.util.*;

/**
 *
 * 需求：统计投票人数
 */
public class Map_test2 {
    public static void main(String[] args) {
        //1.记录每个学生选择情况
        //使用一个Map集合
        Map<String, List<String>> data=new HashMap<>();

        //2.把学生选择的数据存入进去
        List<String> select=new ArrayList<>();
        Collections.addAll(select,"A","B");
        data.put("lxw",select);
        //......

        System.out.println(data);

        //3.统计每个景点选择的人数
        Map<String,Integer> maps=new HashMap<>();

        //4.提取所有人选择的景点的信息
        Collection<List<String>> values=data.values();
        System.out.println(values);

        for (List<String> value: values) {
            for (String s:value) {
                if (maps.containsKey(s)){
                    maps.put(s,maps.get(s)+1);
                }else{
                    maps.put(s,1);
                }
            }
        }

        System.out.println(maps);
    }
}
