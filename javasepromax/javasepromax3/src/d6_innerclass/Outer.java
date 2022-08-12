package d6_innerclass;

/**
 * 外部类
 */
public class Outer {
    /**
     * 成员内部类：不能加static修饰
     */

    public class Inner{
        private String name;
        private int age;
        public static int a;//JDK 16之后可以使用静态成员   以前不能使用是因为对象里面不存在静态的，不然一千个对象有一千的静态，但是静态存在静态区，只有一份
        //JDK 16之后又支持了，因为允许内部类有静态区
        public Inner() {
        }

        public static void test(){
            System.out.println(a);
        }

        public void show(){
            System.out.println("名字:"+name);
        }
        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public static int getA() {
            return a;
        }

        public static void setA(int a) {
            Inner.a = a;
        }
    }
}
