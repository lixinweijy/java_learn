package d5_integer;

/**
 * 目标:明白包装类的概念，并使用
 */
public class Test {
    public static void main(String[] args) {
        int a=10;
        Integer a1=20;
        System.out.println(a1.getClass());
        /**
         * 自动装箱：基本类型的数据和变量可以直接赋值给包装类型的变量
         *
         * 自动拆箱：包装类型的变量可以直接复制给基本数据类型的变量
         */
        Integer a2=a;//自动装箱
        System.out.println(a2);
        int a3=a2;//自动拆箱
        System.out.println(a3);

        /**
         * 包装类的默认值可以是null，容错率更高
         * 可以把基本类型转化为字符串类型  toString
         */
        Integer a4=null;

        Integer a5=23;
        System.out.println(a5.toString());
        System.out.println(a5.toString() + 1);
        System.out.println(a5 + "" + 1);//可以通过加空字符串的方式转化数据为空字符串

        System.out.println("---------------------------");
        //把字符串类型的数值转化为真实的数据类型
        String ch="22";
        int age=Integer.parseInt(ch);
        System.out.println(age);

        String ch1="111.1";
        //转化为小数
        double flt=Double.parseDouble(ch1);
        System.out.println(flt);

        //Double.valueOf转化为Double类型，Integer.valueOf转化为Integer类型
        Double flt1=Double.valueOf(ch1);
        System.out.println(flt1.getClass());


    }
}
