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
        public static int a;//JDK 16之后可以使用静态成员

        public Inner() {
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
