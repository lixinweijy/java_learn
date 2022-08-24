package d9_map_HashMap;

import d1_set.Stuednt;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        //Map集合是根据键去除重复元素
        Map<Stuednt,String> maps=new HashMap<>();

        Stuednt s1=new Stuednt("lxw",20,'男');
        Stuednt s2=new Stuednt("yt",21,'女');
        Stuednt s3=new Stuednt("zj",22,'男');

        maps.put(s1,"北京");
        maps.put(s2,"上海");
        maps.put(s3,"深圳");

        System.out.println(maps);
    }
}
