package d5_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//遍历
public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("c");
        list.add("MySql");

        /**  (1) for 循环 */
        System.out.println("--------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        /**  (2) 迭代器  */
        System.out.println("-----------------------------");
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        /**  (3)foreach */
        System.out.println("-----------------------");
        for(String i:list){
            System.out.println(i);
        }

        /**  (4)JDK 1.8之后的lambda表达式*/
        System.out.println("-----------------------------");
        list.forEach(s -> System.out.println(s));
    }
}
