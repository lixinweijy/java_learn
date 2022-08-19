package d7_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        //  目标:自定义数组的排序规则：Comparator比较器对象
        //  1.Arrays的sort方法对于有值特性的数组是默认升序降序
        double[] nums={1.1,12.2,31,123.2,213.4};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        //  2.需求：降序排序   （自定义比较器对象，只能支持引用类型的排序）
        Integer[] ages={32,43,64,31};


        /**
         * 参数1：排序的数组，必须是引用类型的元素
         * 参数2：匿名内部类对象，代表一个比较对象
         */
        Arrays.sort(ages, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //指定比较规则
                return o2-o1;   //降序
            }
        });

        System.out.println(Arrays.toString(ages));

        System.out.println("--------------------------");
        Student[] students=new Student[3];
        students[0]=new Student("李新伟",18,177.5);
        students[1]=new Student("袁涛",100,10);
        students[2]=new Student("张娟",20,1);

        System.out.println(Arrays.toString(students));

        //排序
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();//按照年龄升序排序
//                return Double.compare(o1.getHeight(), o2.getHeight()) 按照身高升序，比较浮点型可以这样写
            }
        });

        System.out.println(Arrays.toString(students));
    }
}
