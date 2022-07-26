package d6_extends_test;

/**
 * 子类
 */
public class Student extends People{
    /**
     * 独有的行为
     */
    public void writeInfo(){
        System.out.println(getName() + "写下了：哈哈哈哈");
    }
}
