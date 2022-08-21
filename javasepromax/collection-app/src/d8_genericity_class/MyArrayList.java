package d8_genericity_class;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<E> {
    //里面包一个其他类来使用，自己的功能是通过其他类对的功能来实现的
    private ArrayList lists=new ArrayList();

    public void add(E e){
        lists.add(e);
    }

    public void remove(E e){
        lists.remove(e);
    }

    @Override
    public String toString() {
        return lists.toString();
    }
}
