package d3_collection_tracersal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//迭代器不能遍历数组
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> list1=new ArrayList<>();
        list1.add("lxw");
        list1.add("yt");
        list1.add("zj");
        System.out.println(list1);

        //1.得到当前集合的迭代器对象
        Iterator<String> it=list1.iterator();
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());  超出去

        //2.定义while循环
        while(it.hasNext()){//询问是否有next
            System.out.println(it.next());//有的话就打印
        }
        System.out.println("---------------------");

    }
}
