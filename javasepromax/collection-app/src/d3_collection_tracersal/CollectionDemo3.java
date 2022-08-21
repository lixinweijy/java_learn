package d3_collection_tracersal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection<String> lists=new ArrayList<>();
        lists.add("lxw");
        lists.add("yt");
        lists.add("zj");
//        lists.forEach(s -> System.out.println(s) );
        lists.forEach(System.out::println);
    }
}