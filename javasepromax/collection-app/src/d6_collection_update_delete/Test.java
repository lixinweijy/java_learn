package d6_collection_update_delete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//对于遍历中删除元素的问题
public class Test {
    public static void main(String[] args) {
        //1.准备数据
        List<String> list=new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        list.add("666");

        System.out.println(list);

        //a.迭代器遍历删除
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            String ele=it.next();
            if("222".equals(ele)){
                //list.remove("222");有问题
                it.remove();//使用迭代器删除当前所在位置元素，并且不会后移
            }
        }
        System.out.println(list);

        //b.foreach遍历删除
//        for (String s:list) { 不行，删除后面会补上来
//            if("333".equals(s)){
//                list.remove("333");
//            }
//        }

        //c.lambda表达式也是和foreach一样

        //d.for循环
        for (int i = list.size()-1; i >=0; i--) {
            String e=list.get(i);
            if("555".equals(e)){
                list.remove("555");
            }//从后遍历或者将索引减1
        }
        System.out.println(list);

    }
}
