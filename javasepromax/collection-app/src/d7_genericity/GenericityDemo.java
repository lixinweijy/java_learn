package d7_genericity;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型：
 *      泛型是一个标签:<数据类型>
 *      泛型可以在编译阶段约束只能操作某种数据类型
 *
 *注意：
 *      JDK 1.7开始后面的泛型声明可以省略不写
 *
 *小结：
 *      泛型是一个标签
 *      泛型可以在编译阶段约束只能操作某种数据类型
 *      泛型只能支持引用数据类型
 */
public class GenericityDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("java");
        list.add("python");

        System.out.println("-----------------");
        List<Object> list1=new ArrayList<>();//不加泛型编译器会检查类型，性能慢
        list1.add(12);
        list1.add("2");
    }
}
