package d12_genericity_limit;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * 通配符 ?
 *      ?可以在“使用泛型”的时候代表一切类型
 * K T E V
 *
 * 泛型的上下限：
 * ? extends Car： ?必须是Car或者其子类  泛型上限
 * ? extends Car： ?必须是Car或者其子类  泛型下限
 */
public class GenericityDemo {
    public static void main(String[] args) {
        ArrayList<BENC> benc1=new ArrayList<>();
        benc1.add(new BENC());
        go(benc1);

        ArrayList<BMW> bmw1=new ArrayList<>();
        bmw1.add(new BMW());
        go(bmw1);



    }
    public static void go(ArrayList<? extends Car> cars){   //只有继承Car的类型的才能进来

    }
}

class BENC extends Car{

}
class BMW extends Car{

}

class Car{

}