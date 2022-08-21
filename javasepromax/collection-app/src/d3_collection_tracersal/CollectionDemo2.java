package d3_collection_tracersal;

import java.util.ArrayList;
import java.util.Collection;
//foreach遍历
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<String> lists=new ArrayList<>();
        lists.add("yt");
        lists.add("lxw");
        lists.add("zj");
        System.out.println(lists);

        for (String i:lists){
            System.out.println(i);
        }
        System.out.println("-------------------");
        double[] scores={100,12,32,65};
        for (double i:scores){//遍历
            System.out.println(i);
        }
    }
}
