package d1_set;
//哈希值：  JDK根据对象的地址，按照某种规则算出来的int类型的数值

/**
 * HashSet1.7版本原理解析：数组+链表+（结合哈希算法）
 *
 * 1、创建一个默认长度为16的数组，数组名为table，记载因子为0.75
 * 2、根据元素的哈希值跟数组的长度求余计算出应存入的位置(哈希算法)
 * 3、判断当前位置是否为null，如果是null直接存入
 * 4、如果不为null，表示有元素，则调用equals方法比较
 * 5、如果一样，则不存，如果不一样，则存
 *      JDK7新元素占老元素位置，指向老元素
 *      JDK8中新元素挂在老元素下面
 *
 *
 * HashSet1.8版本原理解析
 * 底层结构：哈希表
 * 当挂在元素下面的数据过多是，查询性能降低，从JDK8开始，当链表长度超过8时，自动转化为红黑树
 */
public class SetDemo2 {
    public static void main(String[] args) {
        //目标：学会获取对象的哈希值，并确认一下
        String name="lxw";
        System.out.println(name.hashCode());
        System.out.println(name.hashCode());

        String name1="yt";
        System.out.println(name1.hashCode());
        System.out.println(name1.hashCode());
    }
}
