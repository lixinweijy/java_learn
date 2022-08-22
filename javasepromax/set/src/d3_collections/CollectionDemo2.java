package d3_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo2 {
    public static void main(String[] args) {
        List<Apple> apples=new ArrayList<>();
        apples.add(new Apple("红富士","红色",9,9));
        apples.add(new Apple("白苹果","蓝色",9,8));
        apples.add(new Apple("绿苹果","青色",9,7));

        Collections.sort(apples,((o1, o2) -> o1.getWeight()-o2.getWeight()));
        System.out.println(apples);
    }
}
